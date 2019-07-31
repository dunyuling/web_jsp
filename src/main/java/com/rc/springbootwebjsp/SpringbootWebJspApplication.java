package com.rc.springbootwebjsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.rc.springbootwebjsp.mapper")
@SpringBootApplication
public class SpringbootWebJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebJspApplication.class, args);
    }

}
