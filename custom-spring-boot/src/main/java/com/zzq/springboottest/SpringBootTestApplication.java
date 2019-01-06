package com.zzq.springboottest;

import com.zzq.springboottest.start.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ComponentScan("com.*")
public class SpringBootTestApplication {

    @RequestMapping("/home")
    public String home() {
        return "Hello world";
    }

    public static void main(String[] args) {
        SpringBootApplication.run();
    }
}
