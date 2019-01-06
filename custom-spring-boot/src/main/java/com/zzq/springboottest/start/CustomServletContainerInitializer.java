package com.zzq.springboottest.start;

import com.zzq.springboottest.controller.IndexController;
import com.zzq.springboottest.controller.IndexServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

public class CustomServletContainerInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) {
        System.out.println("CustomServletContainerInitializer.onStartup ---- ");
        //spring利用spi机制    SpringServletContainerInitializer implements ServletContainerInitializer 调用实现WebApplicationInitializer接口的类

        /***
         官方的解释是这样的：为了支持可以不使用web.xml。提供了ServletContainerInitializer，它可以通过SPI机制，当启动web容器的时候，会自动到添加的相应jar包下找到META-INF/services下以ServletContainerInitializer的全路径名称命名的文件，它的内容为ServletContainerInitializer实现类的全路径，将它们实例化。
         * **/

        //下面是spi机制代替web.xml配置servlet的代码
        //ServletRegistration.Dynamic registration = servletContext.addServlet("indexS", new IndexServlet());
        //registration.addMapping("indexS");
    }
}
