package com.imooc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ImoocUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImoocUserApplication.class, args);
	}
}
