package com.example.demo.dao;

import com.example.demo.pojo.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ItemMapper {

    List<Item> queryUserById(int id);
    Item saveItem(Item item1);
}