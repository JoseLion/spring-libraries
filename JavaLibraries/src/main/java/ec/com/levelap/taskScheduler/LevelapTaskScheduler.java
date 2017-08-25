package ec.com.levelap.taskScheduler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.support.CronTrigger;

public class LevelapTaskScheduler {
	private TaskScheduler taskScheduler;
	
	private List<FutureObject> futureTasks;

	public LevelapTaskScheduler(TaskScheduler taskScheduler) {
		this.taskScheduler = taskScheduler;
		this.futureTasks = new ArrayList<>();
	}
	
	public ScheduledFuture<?> scheduleTaskAtDate(Date date, String key, Runnable task) {
		Date today = new Date();
		
		if (!today.after(date)) {
			ScheduledFuture<?> future = taskScheduler.schedule(task, date);
			this.futureTasks.add(new FutureObject(key, future));
			return future;
		}
		
		return null;
	}
	
	public ScheduledFuture<?> scheduleTaskWithTrigger(Trigger trigger, String key, Runnable task) {
		ScheduledFuture<?> future = taskScheduler.schedule(task, trigger);
		this.futureTasks.add(new FutureObject(key, future));
		return future;
	}
	
	public ScheduledFuture<?> scheduleTaskWithCron(String cron, String key, Runnable task) {
		ScheduledFuture<?> future = taskScheduler.schedule(task, new CronTrigger(cron));
		this.futureTasks.add(new FutureObject(key, future));
		return future;
	}
	
	public List<FutureObject> getFutureTasks() {
		return futureTasks;
	}

	public void setFutureTasks(List<FutureObject> futureTasks) {
		this.futureTasks = futureTasks;
	}
	
	public void removeFutureTask(String key) {
		for (int i = this.futureTasks.size() - 1; i >= 0; i--) {
			if (this.futureTasks.get(i).getKey().equals(key)) {
				this.futureTasks.remove(i);
			}
		}
	}
	
	public void removeAndCancelFutureTask(String key) {
		for (int i = this.futureTasks.size() - 1; i >= 0; i--) {
			if (this.futureTasks.get(i).getKey().equals(key)) {
				this.futureTasks.get(i).getFuture().cancel(true);
				this.futureTasks.remove(i);
			}
		}
	}
}
