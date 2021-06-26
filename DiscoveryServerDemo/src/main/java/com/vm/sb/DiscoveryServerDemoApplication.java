package com.vm.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class DiscoveryServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerDemoApplication.class, args);
	}

}
