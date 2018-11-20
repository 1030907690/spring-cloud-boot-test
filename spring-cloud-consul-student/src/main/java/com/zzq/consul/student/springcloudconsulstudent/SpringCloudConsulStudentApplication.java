package com.zzq.consul.student.springcloudconsulstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动 consul命令   consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=192.168.0.111  192.168.0.111是地址
 * 现在@org.springframework.cloud.client.discovery.EnableDiscoveryClient在src文件夹中的Spring启动应用程序类中添加注释。
 * 使用此注释，此工件将像弹簧发现客户端一样工作，并将自己注册到附加到此服务的consul服务器中
 * **/
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsulStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulStudentApplication.class, args);
	}
}
