package ec.com.levelap.security;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value=SecurityConst.LOGIN_BASE_URL)
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class LoginController {
	@RequestMapping(value=SecurityConst.LOGIN_USER_URL, method=RequestMethod.GET)
	public Principal user(Principal user) {
		return user;
	}
	
	@RequestMapping(value=SecurityConst.LOGIN_TOKEN_URL, method=RequestMethod.GET)
	@ResponseBody
	public Map<String,String> token(HttpSession session) {
		return Collections.singletonMap(SecurityConst.TOKEN_KEY, session.getId());
	}
}
