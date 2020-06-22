package com.example.demo.controller;

import com.example.demo.pojo.Item;
import com.example.demo.service.ItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ItemController {
    @Resource
    ItemService im;
    @RequestMapping("/item")

    public List<Item> getTest() {
        return im.queryUserById(7);
    }


}