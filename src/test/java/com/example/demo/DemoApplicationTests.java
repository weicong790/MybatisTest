package com.example.demo;

import com.example.demo.dao.ItemMapper;
import org.junit.jupiter.api.Test;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

//@SpringBootTest
class DemoApplicationTests {
    private static final Logger log= LoggerFactory.getLogger(DemoApplicationTests.class);
    @Test
    void contextLoads() {
    }
@Resource
    ItemMapper im;
    @Test
    void test(){

        try {
           // int a=1/0;
            log.info("测试成功!");
        }catch (Exception e){
            log.error("发送简单文本文件-发生异常： ",e.fillInStackTrace());
        }
}
}
