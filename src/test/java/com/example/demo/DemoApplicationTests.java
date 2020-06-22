package com.example.demo;

import com.example.demo.dao.ItemMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
@Resource
    ItemMapper im;
    @Test
    void test(){
        System.out.println(im.queryUserById(7));
    }
}
