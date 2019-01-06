package com.zzq.springboottest.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

@RestController
public class IndexController {


    @RequestMapping("index")
    public void index(HttpServletRequest request, HttpServletResponse response) {

        //读取文件
        String staticPath = this.getClass().getResource("/static").getPath();
        String rstr = "";
        try {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            String path = staticPath+File.separator + "index.html";

            FileSystemResource resource = new FileSystemResource(path);
            BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));
            String str = null;
            while ((str = br.readLine()) != null) {
                rstr += str;
            }
            br.close();

            response.getWriter().print(rstr);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
