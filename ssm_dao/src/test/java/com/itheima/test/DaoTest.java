package com.itheima.test;

import com.itheima.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

    @Test
    public void testDao() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = app.getBean(ItemsDao.class);
        System.out.println(itemsDao.findAll());
    }
}
