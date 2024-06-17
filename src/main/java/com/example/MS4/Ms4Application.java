package com.example.MS4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@ComponentScan({"com.example.MS4.controller", "com.example.MS4.model", "com.example.MS4.repository", "com.example.MS4.client","com.example.MS4.configurations", "com.example.MS4.service"})
public class Ms4Application {

	public static void main(String[] args) {

		SpringApplication.run(Ms4Application.class, args);

		//System.out.println("Hello World");
	}

}
