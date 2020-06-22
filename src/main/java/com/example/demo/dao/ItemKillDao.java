package com.example.demo.dao;

import com.example.demo.pojo.ItemKill;

public interface ItemKillDao {
    //按照id删除行
    int deleteByPrimaryKey(Integer id);
//全部插入
    int insert(ItemKill record);
//部分插入
    int insertSelective(ItemKill record);
//会查询所有列
    ItemKill selectByPrimaryKey(Integer id);
//传进来的record不是全部都有值，xml中会自动去掉
    int updateByPrimaryKeySelective(ItemKill record);
//全部更新
    int updateByPrimaryKey(ItemKill record);
}