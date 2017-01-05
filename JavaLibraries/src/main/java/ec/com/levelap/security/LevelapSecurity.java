package ec.com.levelap.security;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class LevelapSecurity {
	private SecurityConfig config;

	public LevelapSecurity(SecurityConfig config) {
		super();
		this.config = config;
	}

	public SecurityConfig getConfig() {
		return config;
	}

	public void setConfig(SecurityConfig config) {
		this.config = config;
	}
}
