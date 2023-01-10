package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutoWiredLectApplication {
 
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutoWiredLectApplication.class, args); // returns configurable object
		
		Alien a = context.getBean(Alien.class);      // dependency injection
		a.show();
//		
//		Alien a1 = context.getBean(Alien.class); 
//		a1.show();
//		
//		Sample s = context.getBean(Sample.class);
//		s.display(10);
	}

}
