package com.example;

import com.example.service.Speak;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringAutowiredApplication {

	public static void main(String[] args) {
		String name = "Mike";
		BeanFactory factory = SpringApplication.run(SpringAutowiredApplication.class, args);
		Speak speak = factory.getBean(Speak.class);
		speak.hello(name);
		speak.bay(name);

	}
}
