package ec.com.levelap.security;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

public class SecurityAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {
	@Autowired
	private LevelapSecurity levelapSecurity;
	
	@Autowired
	private AuthenticationService authService;
	
	private AuthenticationFilter authenticationFilter = new AuthenticationFilter();
	
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws AuthenticationException, IOException, ServletException {
		String[] decoded = authenticationFilter.getAuthHeaderDecoded(request);
		String username = decoded[0];
		response.setContentType(SecurityConst.TEXT_UTF8_HEADER);
		
		if (decoded.length == 3) {
			if (username.isEmpty()) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.getWriter().print(SecurityConst.USER_NOT_FOUND);
				response.flushBuffer();
			}
			
			if (!username.isEmpty() && Boolean.parseBoolean(decoded[2])) {
				boolean wasResetted = levelapSecurity.getConfig().resetUserPassword(username, authService.getExtra());
				
				if (wasResetted) {
					response.setStatus(HttpServletResponse.SC_OK);
					response.getWriter().print(SecurityConst.OK);
					response.flushBuffer();
				} else {
					response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
					response.getWriter().print(SecurityConst.USER_NOT_FOUND);
					response.flushBuffer();
				}
			}
		} else {
			if (!username.isEmpty() && exception.getClass().isAssignableFrom(BadCredentialsException.class)) {
				levelapSecurity.getConfig().setLastFailedAttempt(username, new Date(), authService.getExtra());
				
				if (levelapSecurity.getConfig().getNumberOfAttempts(username, authService.getExtra()) != null) {
					levelapSecurity.getConfig().setNumberOfAttempts(username, levelapSecurity.getConfig().getNumberOfAttempts(username, authService.getExtra()) + 1, authService.getExtra());
					
					if (levelapSecurity.getConfig().getNumberOfAttempts(username, authService.getExtra()) >= levelapSecurity.getConfig().getMaxAttempts()) {
						levelapSecurity.getConfig().setLockDate(username, new Date(), authService.getExtra());
					}
				}
			}
			
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			
			if (exception.getClass().isAssignableFrom(BadCredentialsException.class)) {
				response.getWriter().print(SecurityConst.BAD_CREDENTIALS);
			} else if (exception.getClass().isAssignableFrom(LockedException.class)) {
				response.getWriter().print(SecurityConst.USER_LOCKED);
			} else if (exception.getClass().isAssignableFrom(DisabledException.class)) {
				response.getWriter().print(SecurityConst.USER_DISABLED);
			} else {
				response.getWriter().print("La autenticación falló: " + exception.getMessage());
			}
			
			response.flushBuffer();
		}
	}
}
