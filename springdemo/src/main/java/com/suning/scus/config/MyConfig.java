package com.suning.scus.config;

import com.suning.scus.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sys.properties")
public class MyConfig {
	@Bean
	public Person person() {
		return new Person("jack", 12);
	}
}
