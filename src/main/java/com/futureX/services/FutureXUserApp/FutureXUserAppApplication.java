package com.futureX.services.FutureXUserApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FutureXUserAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutureXUserAppApplication.class, args);
	}

}
