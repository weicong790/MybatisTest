package com.example.demo;

import com.example.demo.dao.ItemKillDao;
import com.example.demo.dao.ItemMapper;
import com.example.demo.pojo.Item;
import com.example.demo.pojo.ItemKill;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

//@SpringBootTest
public class MybatisTest {
    private SqlSessionFactory sqlSessionFactory = null;
//    @Before
    public void init() throws Exception {
// 1. 创建 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
                SqlSessionFactoryBuilder();
// 2. 加载 SqlMapConfig.xml 配置文件
        InputStream inputStream =
                Resources.getResourceAsStream("SqlMapConfig.xml");
// 3. 创建 SqlSessionFactory 对象
        this.sqlSessionFactory =
                sqlSessionFactoryBuilder.build(inputStream);
    }
    @Test
    public void testQueryUserById() throws Exception {
        //todo 对于 查询，会直接返回类， 插入，会在你传入得类上做修改。
        init();
// 4. 创建 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

// 5. 执行 SqlSession 对象执行查询，获取结果 User
// 第一个参数是 User.xml 的 statement 的 id，第二个参数是执行 sql 需
//        Item user = sqlSession.selectOne("queryUserById", 6);
//        Item item1=new Item();
//        item1.setName("a");
//        item1.setCode("1");
//        item1.setStock(3);
//        sqlSession.insert("saveItem", item1);


//        ItemKill ik = new ItemKill();
//        ik.setId(3);
//        ik= sqlSession.selectOne("selectByPrimaryKey", ik);

//        动态代理的方式
//        ItemKillDao itemKillMapper = sqlSession.getMapper(ItemKillDao.class);
//        ItemKill ik = new ItemKill();
//        ik= itemKillMapper.selectByPrimaryKey(3);
// 6. 打印结果
        //这个类在运行过程中是会被修改的，我尝试在xml中修改了传进去的值，在这里输出会有体现
        //System.out.println(ik);
// 7. 释放资源
      //  sqlSession.commit();//不提交，就写不进去库,读库不需要
        sqlSession.close();
    }

    @Resource
    ItemMapper im;
    @Test
    void test1(){
        System.out.println(im.queryUserById(6));
    }
}