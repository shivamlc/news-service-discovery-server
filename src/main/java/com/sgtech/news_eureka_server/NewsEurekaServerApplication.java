package com.sgtech.news_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // This annotation enables the Eureka server functionality and makes this application a service discovery agent.
public class NewsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsEurekaServerApplication.class, args);
	}

}
