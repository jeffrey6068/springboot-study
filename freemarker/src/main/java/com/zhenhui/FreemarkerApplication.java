package com.zhenhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.Controller")
public class FreemarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreemarkerApplication.class, args);
	}
}
