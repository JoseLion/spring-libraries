package ec.com.levelap.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
