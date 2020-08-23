package com.yuanfei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot1Application {

    public static void main(String[] args) {
        System.out.println("张三的第一次修改");
        SpringApplication.run(Springboot1Application.class, args);
    }

}
