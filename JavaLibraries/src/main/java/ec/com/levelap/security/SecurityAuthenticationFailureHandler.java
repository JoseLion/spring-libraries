package ec.com.levelap.security;

import java.io.IOException;
import java.util.Date;

import javax.mail.MessagingException;
import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

public class SecurityAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {
	@Autowired
	private LevelapSecurity levelapSecurity;
	
	private AuthenticationFilter authenticationFilter = new AuthenticationFilter();
	
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException, MessagingException {
		String[] decoded = authenticationFilter.getAuthHeaderDecoded(request);
		String username = decoded[0];
		
		if (decoded.length == 3) {
			if (username.isEmpty()) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, SecurityConst.USER_NOT_FOUND);
			}
			
			if (!username.isEmpty() && Boolean.parseBoolean(decoded[2])) {
				levelapSecurity.getConfig().resetUserPassword(username);
				response.getWriter().print(SecurityConst.OK);
				response.flushBuffer();
			}
		} else {
			if (!username.isEmpty() && exception.getClass().isAssignableFrom(BadCredentialsException.class)) {
				levelapSecurity.getConfig().setNumberOfAttempts(username, levelapSecurity.getConfig().getNumberOfAttempts(username) + 1);
				levelapSecurity.getConfig().setLastFailedAttempt(username, new Date());
				
				if (levelapSecurity.getConfig().getNumberOfAttempts(username) != null) {
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
