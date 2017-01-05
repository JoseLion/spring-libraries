package ec.com.levelap.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

public class SecurityAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
	@Autowired
	private LevelapSecurity levelapSecurity;
	
	private AuthenticationFilter authenticationFilter = new AuthenticationFilter();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		System.out.println("********************** AUTHENTICATED!!!");
		String username = authenticationFilter.getAuthHeaderDecoded(request)[0];
		
		if (levelapSecurity.getConfig().getNumberOfAttempts(username) != null) {
			if (!username.isEmpty() && levelapSecurity.getConfig().getNumberOfAttempts(username) != 0) {
				levelapSecurity.getConfig().setNumberOfAttempts(username, 0);
				levelapSecurity.getConfig().setLockDate(username, null);
				levelapSecurity.getConfig().setLastFailedAttempt(username, null);
			}
		}
		
		response.getWriter().print(SecurityConst.OK);
        response.flushBuffer();
	}
}
