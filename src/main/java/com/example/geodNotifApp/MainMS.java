package com.example.geodNotifApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient
//@ComponentScan({"com.example.MS4.controller", "com.example.MS4.model", "com.example.MS4.repository", "com.example.MS4.client","com.example.MS4.configurations"})
public class MainMS {

	public static void main(String[] args) {

		SpringApplication.run(MainMS.class, args);
	}

}
