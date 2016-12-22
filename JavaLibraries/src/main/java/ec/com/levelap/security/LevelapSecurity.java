package ec.com.levelap.security;

import org.springframework.stereotype.Service;

@Service
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
