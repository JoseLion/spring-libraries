package ec.com.levelap.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.core.annotation.Order;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class AuthenticationService implements UserDetailsService {
	@Autowired
	private LevelapSecurity levelapSecurity;
	
	private String extra;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (username == null) {
			throw new UsernameNotFoundException(SecurityConst.USER_NOT_FOUND);
		}
		
		Boolean isLocked = false;
		
		if (levelapSecurity.getConfig().getLastFailedAttempt(username, this.getExtra()) != null) {
			if (levelapSecurity.getConfig().getResetTimeHours() != null) {
				Date today = new Date();
				Double timeToReset = levelapSecurity.getConfig().getResetTimeHours() * 60.0 * 60.0 * 1000.0;
				
				if ((levelapSecurity.getConfig().getLastFailedAttempt(username, this.getExtra()).getTime() + timeToReset) < today.getTime()) {
					levelapSecurity.getConfig().setLastFailedAttempt(username, null, this.getExtra());
					levelapSecurity.getConfig().setNumberOfAttempts(username, 0, this.getExtra());
				}
			}
		}
		
		if (levelapSecurity.getConfig().getLockDate(username, this.getExtra()) != null) {
			isLocked = true;
			
			if (levelapSecurity.getConfig().getLockTimeMinutes() != null) {
				Date today = new Date();
				Double timeToUnlock = levelapSecurity.getConfig().getLockTimeMinutes() * 60.0 * 1000.0;
				
				if (isLocked) {
					if ((levelapSecurity.getConfig().getLockDate(username, this.getExtra()).getTime() + timeToUnlock) < today.getTime()) {
						isLocked = false;
						unlockUser(username);
					}
				}
			} else {
				isLocked = false;
				unlockUser(username);
			}
		}
		
		return new AuthenticatedUser(levelapSecurity.getConfig().getUserId(username, this.getExtra()), username, levelapSecurity.getConfig().getPassword(username, this.getExtra()), levelapSecurity.getConfig().getRoles(username, this.getExtra()), levelapSecurity.getConfig().getIsLoked(username, this.getExtra()));
	}
	
	private void unlockUser(String username) {
		levelapSecurity.getConfig().setLockDate(username, null, this.getExtra());
		levelapSecurity.getConfig().setNumberOfAttempts(username, 0, this.getExtra());
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}
}
