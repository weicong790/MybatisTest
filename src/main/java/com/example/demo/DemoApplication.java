package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

//测试github功能
@SpringBootApplication
public class DemoApplication {
    //第二个注释添加a
    //分支测试
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
