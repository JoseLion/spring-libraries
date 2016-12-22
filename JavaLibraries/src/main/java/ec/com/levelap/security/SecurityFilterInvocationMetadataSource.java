package ec.com.levelap.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

public class SecurityFilterInvocationMetadataSource implements FilterInvocationSecurityMetadataSource {
	protected MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();
	private HashMap<String, List<String>> urlRoles;

	@Override
	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
		List<String> roles = null;
		FilterInvocation fi = (FilterInvocation)object;

		HttpServletRequest req = fi.getHttpRequest();
		String method = req.getMethod();
		
		String urlInc = fi.getRequestUrl();
		int lastSlash = urlInc.lastIndexOf("/");
		
		if (urlInc.substring(lastSlash).matches("^.+?\\d$")) {
			urlInc = urlInc.substring(0, lastSlash);
		}
		
		String url = method + ":" + urlInc;
		
		if (urlRoles != null) {
			roles = urlRoles.get(url);
		} else {
			roles = new ArrayList<>();
		}
		
		String[] stockArr = new String[roles.size()];
		stockArr = roles.toArray(stockArr);

		return org.springframework.security.access.SecurityConfig.createList(stockArr);
	}

	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	public MessageSourceAccessor getMessages() {
		return messages;
	}

	public void setMessages(MessageSourceAccessor messages) {
		this.messages = messages;
	}

	public HashMap<String, List<String>> getUrlRoles() {
		return urlRoles;
	}

	public void setUrlRoles(HashMap<String, List<String>> urlRoles) {
		this.urlRoles = urlRoles;
	}
}
