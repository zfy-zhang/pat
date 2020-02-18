package com.pat.pmp.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *@Description：启动类
 *@Author 不才人
 *@Create Date 2020/2/18 11:03 上午
 *@Modify
 */
@SpringBootApplication
@MapperScan(basePackages = "com.pat.pmp.model.mapper")
public class ServerMainApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ServerMainApplication.class);
    }

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext run = SpringApplication.run(ServerMainApplication.class, args);
    }
}