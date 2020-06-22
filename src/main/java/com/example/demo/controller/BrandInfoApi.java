package com.example.demo.controller;


import com.example.demo.dao.ItemMapper;
import com.example.demo.pojo.Item;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@Api(tags = "获取商店信息接口")
@RequestMapping("/brand")
public class BrandInfoApi {
    @Resource
    ItemMapper im;
    @RequestMapping("/brandInfo")

    public List<Item> getTest() {
//        System.out.println("---------------开始打印提供服务机器的端口号--------------------------");
//        System.out.println("port: "+ getPort.getPort());
//        System.out.println("---------------------------------------");
        List<Item> brandLIst =im.queryUserById(7);
        return brandLIst;
    }


}
