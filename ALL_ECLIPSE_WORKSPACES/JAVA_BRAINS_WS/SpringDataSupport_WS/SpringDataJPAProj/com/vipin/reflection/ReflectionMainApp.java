package com.vipin.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionMainApp {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<?> clazz = null;
		clazz = Class.forName("com.vipin.service.DBServices");
		
		/*User user = null;
		user = (User)Class.forName("com.vipin.model.User").newInstance();
		System.out.println(user);
		 */
		
		/*Annotation annos[];
		annos = clazz.getAnnotations();
		for(Annotation an:annos) {
			System.out.println(an);
			System.out.println();
			System.out.println(an.annotationType());
		}*/
		
		Method meths[];
		//meths = clazz.getMethods();
		meths = clazz.getDeclaredMethods();
		
		for(Method meth:meths) {
			System.out.println(meth);
			Annotation annos1[] = meth.getDeclaredAnnotations();
				for(Annotation an:annos1) {
					System.out.println(an);
					System.out.println();
				}
			System.out.println();
		}
	}
}