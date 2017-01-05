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
	
	private AuthenticationFilter authenticationFilter = new AuthenticationFilter();
	
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws AuthenticationException, IOException, ServletException {
		String[] decoded = authenticationFilter.getAuthHeaderDecoded(request);
		String username = decoded[0];
		
		if (decoded.length == 3) {
			if (username.isEmpty()) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, SecurityConst.USER_NOT_FOUND);
			}
			
			if (!username.isEmpty() && Boolean.parseBoolean(decoded[2])) {
				boolean wasResetted = levelapSecurity.getConfig().resetUserPassword(username);
				
				System.out.println("WAS RESETTED? " + wasResetted);
				
				if (wasResetted) {
					response.getWriter().print(SecurityConst.OK);
					response.flushBuffer();
				} else {
					response.sendError(HttpServletResponse.SC_UNAUTHORIZED, SecurityConst.USER_NOT_FOUND);
				}
			}
		} else {
			if (!username.isEmpty() && exception.getClass().isAssignableFrom(BadCredentialsException.class)) {
				levelapSecurity.getConfig().setLastFailedAttempt(username, new Date());
				
				if (levelapSecurity.getConfig().getNumberOfAttempts(username) != null) {
					levelapSecurity.getConfig().setNumberOfAttempts(username, levelapSecurity.getConfig().getNumberOfAttempts(username) + 1);
					
					if (levelapSecurity.getConfig().getNumberOfAttempts(username) >= levelapSecurity.getConfig().getMaxAttempts()) {
						levelapSecurity.getConfig().setLockDate(username, new Date());
					}
				}
			}
			
			if (exception.getClass().isAssignableFrom(BadCredentialsException.class)) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, SecurityConst.BAD_CREDENTIALS);
			} else if (exception.getClass().isAssignableFrom(LockedException.class)) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, SecurityConst.USER_LOCKED);
			} else if (exception.getClass().isAssignableFrom(DisabledException.class)) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, SecurityConst.USER_DISABLED);
			} else {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "La autenticación falló: " + exception.getMessage());
			}
		}
	}
}
