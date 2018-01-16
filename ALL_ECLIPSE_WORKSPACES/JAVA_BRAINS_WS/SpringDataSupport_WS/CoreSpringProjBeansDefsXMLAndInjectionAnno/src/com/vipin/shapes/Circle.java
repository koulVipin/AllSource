package com.vipin.shapes;

import javax.annotation.Resource;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.vipin.point.Point;

public class Circle implements InitializingBean, DisposableBean {
	
	@Resource(name="pointID")
	private Point point;
	
	@Override
	public String toString() {
		return "Circle [point=" + point + "]";
	}
	
	//@PostConstruct
	public void afterCreate() {
		System.out.println("Just after the bean creation");
	}
	
	//@PreDestroy
	public void beforeDestroy() {
		System.out.println("Just before bean destruction");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("In destroy().. courtesy DisposableBean interface");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In afterPropertiesSet(), coutesty InitializingBean interface");
		
	}
}