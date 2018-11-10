package com.zzq.springboottest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class IndexController {

    @Value("${spring.custom.value}")
    private String value;


    @ResponseBody
    @RequestMapping("index")
    public String index(){
        return "index " +value;
    }
}
