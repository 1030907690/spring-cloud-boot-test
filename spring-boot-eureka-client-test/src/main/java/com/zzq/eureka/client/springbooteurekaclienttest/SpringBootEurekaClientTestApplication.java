package com.zzq.eureka.client.springbooteurekaclienttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClientTestApplication.class, args);
	}
}
