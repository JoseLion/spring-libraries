package ec.com.levelap.taskScheduler;

import java.util.concurrent.ScheduledFuture;

public class FutureObject {
	private String key;
	
	private ScheduledFuture<?> future;

	public FutureObject(String key, ScheduledFuture<?> future) {
		super();
		this.key = key;
		this.future = future;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public ScheduledFuture<?> getFuture() {
		return future;
	}

	public void setFuture(ScheduledFuture<?> future) {
		this.future = future;
	}
}
