package com.example.demo.service;

import com.example.demo.dao.ItemMapper;
import com.example.demo.pojo.Item;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemService {

    @Resource
    ItemMapper im;

    public List<Item> queryUserById(Integer id) {
        return im.queryUserById(id);
    }

}