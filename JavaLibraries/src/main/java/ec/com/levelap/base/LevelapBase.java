package ec.com.levelap.base;

import org.springframework.stereotype.Service;

@Service
public class LevelapBase {
	private LevelapBaseConfig config;

	public LevelapBase(LevelapBaseConfig config) {
		super();
		this.config = config;
	}

	public LevelapBaseConfig getConfig() {
		return config;
	}

	public void setConfig(LevelapBaseConfig config) {
		this.config = config;
	}
}
