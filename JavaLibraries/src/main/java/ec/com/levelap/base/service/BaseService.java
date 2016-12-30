package ec.com.levelap.base.service;

import java.lang.reflect.Method;

import javax.servlet.ServletException;

public abstract class BaseService<ENTITY> {

	private Class<ENTITY> type;

	public ENTITY changeState(ENTITY obj) throws ServletException {
		try {
			Method getStatus = this.type.getMethod("getStatus");
			Method setStatus = this.type.getMethod("setStatus", Boolean.class);
			Boolean status = (Boolean) getStatus.invoke(obj);
			setStatus.invoke(obj, !status);
			return obj;
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
