package ec.com.levelap.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements UserDetailsService {
	@Autowired
	private LevelapSecurity levelapSecurity;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (username == null) {
			throw new UsernameNotFoundException(SecurityConst.USER_NOT_FOUND);
		}
		
		Boolean isLocked = false;
		
		if (levelapSecurity.getConfig().getLastFailedAttempt(username) != null) {
			if (levelapSecurity.getConfig().getResetTimeHours() != null) {
				Date today = new Date();
				Double timeToReset = levelapSecurity.getConfig().getResetTimeHours() * 60.0 * 60.0 * 1000.0;
				
				if ((levelapSecurity.getConfig().getLastFailedAttempt(username).getTime() + timeToReset) < today.getTime()) {
					levelapSecurity.getConfig().setLastFailedAttempt(username, null);
					levelapSecurity.getConfig().setNumberOfAttempts(username, 0);
				}
			}
		}
		
		if (levelapSecurity.getConfig().getLockDate(username) != null) {
			isLocked = true;
			
			if (levelapSecurity.getConfig().getLockTimeMinutes() != null) {
				Date today = new Date();
				Double timeToUnlock = levelapSecurity.getConfig().getLockTimeMinutes() * 60.0 * 1000.0;
				
				if (isLocked) {
					if ((levelapSecurity.getConfig().getLockDate(username).getTime() + timeToUnlock) < today.getTime()) {
						isLocked = false;
						unlockUser(username);
					}
				}
			} else {
				isLocked = false;
				unlockUser(username);
			}
		}
		
		return new AuthenticatedUser(username, levelapSecurity.getConfig().getPassword(username), levelapSecurity.getConfig().getRoles(username), levelapSecurity.getConfig().getIsLoked(username));
	}
	
	private void unlockUser(String username) {
		levelapSecurity.getConfig().setLockDate(username, null);
		levelapSecurity.getConfig().setNumberOfAttempts(username, 0);
	}
}
