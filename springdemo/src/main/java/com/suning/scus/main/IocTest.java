package com.suning.scus.main;

import com.suning.scus.config.MyConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class IocTest {

	@Autowired
	private Environment env;

	@Test
	public void test_ioc() {
		ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
//		ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
		env = app.getEnvironment();
		String property = env.getProperty("os.name");
		System.out.println("os.name:"+property);
		System.out.println("os.name111:"+env.getProperty("daty"));
		String[] names = app.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
	}
}
