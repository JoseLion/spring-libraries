package ec.com.levelap.security;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityBeans {
	@Bean
	public SecurityAuthenticationSuccessHandler securityAuthenticationSuccessHandler() {
		return new SecurityAuthenticationSuccessHandler();
	}
	
	@Bean
	public SecurityAuthenticationFailureHandler securityAuthenticationFailureHandler() {
		return new SecurityAuthenticationFailureHandler();
	}
}
