package com.zzq.hystrix.server.springboothystrixservertest;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;


/**
 * and add @EnableHystrixDashboard and @EnableCircuitBreaker annotations
 *
 * http://localhost:9098/hystrix  仪表盘
 *
 * 添加 http://localhost:9098/hystrix.stream
 *
 * 访问了http://localhost:9098/的接口才能看到Hystrix 的图
 * **/
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringBootHystrixServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHystrixServerTestApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean getServlet() {
		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
		registrationBean.setLoadOnStartup(1);
		registrationBean.addUrlMappings("/hystrix.stream");
		registrationBean.setName("HystrixMetricsStreamServlet");
		return registrationBean;
	}
}
