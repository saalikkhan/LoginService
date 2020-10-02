package com.slktools.loginservice.systemutil;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppContextProvider implements ApplicationContextAware{

	private static ApplicationContext CONTEXT;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		CONTEXT = applicationContext;
	}

	public static Object initializeBean(String beanName) {
		return CONTEXT.getBean(beanName);
	}

}
