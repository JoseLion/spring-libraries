package ec.com.levelap.security;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

public class AuthenticationFilter extends AbstractAuthenticationProcessingFilter {

	protected AuthenticationFilter() {
		super(new AntPathRequestMatcher(SecurityConst.LOGIN_BASE_URL + SecurityConst.LOGIN_USER_URL, SecurityConst.ANT_REQUEST_MATCHER_METHOD));
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if (auth == null) {
			String username = getAuthHeaderDecoded(request)[0].trim();
			String password = getAuthHeaderDecoded(request)[1];
			
			auth = getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(username, password));
		}
		
		return auth;
	}
	
	public String[] getAuthHeaderDecoded(HttpServletRequest request) throws UnsupportedEncodingException {
		String authorizationHeader = request.getHeader(SecurityConst.AUTHORIZATION_HEADER);
		
		if (authorizationHeader != null) {
			String authorizationEncoded = authorizationHeader.substring(SecurityConst.AUTHORIZATION_HEADER_OFFSET);
			byte[] valueDecodedBytes = Base64.decode(authorizationEncoded.getBytes(SecurityConst.UTF8));
			String valueDecoded = new String(valueDecodedBytes, SecurityConst.UTF8);
			String usernamePasswordSeparated[] = valueDecoded.split(SecurityConst.HEADER_SPLITTER);
			
			return usernamePasswordSeparated;
		} else {
			return new String[]{"", ""};
		}
	}
}
