package ec.com.levelap.taskScheduler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class LevelapTaskSchedulerConfiguration {
	@Bean
	public ThreadPoolTaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler pool = new ThreadPoolTaskScheduler();
		pool.setPoolSize(10);
		return pool;
	}

	@Bean
	public LevelapTaskScheduler smartbidTaskScheduler() {
		return new LevelapTaskScheduler(taskScheduler());
	}
}
