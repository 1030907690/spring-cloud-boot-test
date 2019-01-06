package com.zzq.springboottest.start;


import org.apache.catalina.Context;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

public class SpringBootApplication {


    public static void run() {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        //设置要发布的项目
        String sourcePath = SpringBootApplication.class.getResource("/").getPath();

        try {
            //告诉Tomcat源码的位置
            Context ctx = tomcat.addWebapp("/",
                    new File("custom-spring-boot/target").getAbsolutePath());
            WebResourceRoot resource = new StandardRoot(ctx);
            resource.addPreResources(new DirResourceSet(
                    resource,"/WEB-INF/classes",sourcePath,"/"
            ));

            ctx.setResources(resource);


            tomcat.start();
            tomcat.getServer().await();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
