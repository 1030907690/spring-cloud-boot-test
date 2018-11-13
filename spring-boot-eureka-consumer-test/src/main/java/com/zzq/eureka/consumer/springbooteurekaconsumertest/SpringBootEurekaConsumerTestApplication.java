package com.zzq.eureka.consumer.springbooteurekaconsumertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaConsumerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaConsumerTestApplication.class, args);
	}
}
