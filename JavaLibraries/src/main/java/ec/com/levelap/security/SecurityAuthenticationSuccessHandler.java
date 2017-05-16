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
	
	@Autowired
	private AuthenticationService authService;
	
	private AuthenticationFilter authenticationFilter = new AuthenticationFilter();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		String username = authenticationFilter.getAuthHeaderDecoded(request)[0];
		
		if (levelapSecurity.getConfig().getNumberOfAttempts(username, authService.getExtra()) != null) {
			if (!username.isEmpty() && levelapSecurity.getConfig().getNumberOfAttempts(username, authService.getExtra()) != 0) {
				levelapSecurity.getConfig().setNumberOfAttempts(username, 0, authService.getExtra());
				levelapSecurity.getConfig().setLockDate(username, null, authService.getExtra());
				levelapSecurity.getConfig().setLastFailedAttempt(username, null, authService.getExtra());
			}
		}
		
		response.setContentType(SecurityConst.TEXT_UTF8_HEADER);
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().print(SecurityConst.OK);
        response.flushBuffer();
        
        levelapSecurity.getConfig().handleSuccess();
	}
}
