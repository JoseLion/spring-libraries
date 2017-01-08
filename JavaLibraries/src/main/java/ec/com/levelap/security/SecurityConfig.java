package ec.com.levelap.security;

import java.util.Date;
import java.util.List;

public interface SecurityConfig {
	public Long getUserId(String username);
	
	public String getPassword(String username);
	
	public List<String> getRoles(String username);
	
	public Boolean getIsLoked(String username);
	
	public Date getLockDate(String username);
	
	public void setLockDate(String username, Date date);
	
	public Double getLockTimeMinutes();
	
	public Date getLastFailedAttempt(String username);
	
	public void setLastFailedAttempt(String username, Date date);
	
	public Integer getNumberOfAttempts(String username);
	
	public void setNumberOfAttempts(String username, Integer attempts);
	
	public Integer getMaxAttempts();
	
	public Double getResetTimeHours();
	
	public boolean resetUserPassword(String username);
}
