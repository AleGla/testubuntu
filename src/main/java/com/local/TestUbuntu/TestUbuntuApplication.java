package com.local.TestUbuntu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TestUbuntuApplication {
	
	public static void main(String[] args) {
		System.setProperty("spring.config.location", "/home/ubuntudev/eclipse-workspace/TestUbuntu/src/main/resources/application.properties");
		SpringApplication.run(TestUbuntuApplication.class, args);
	}

}
