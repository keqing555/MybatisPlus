package com.mybatisplus;

import com.mybatisplus.bean.Role;
import com.mybatisplus.dao.RoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

class MybatisPlusApplicationTests {
    @Autowired
    private RoleMapper roleMapper;

    @Test
    void contextLoads() {
        //查询所有
        List<Role> role = roleMapper.selectList(null);
        role.forEach(System.out::println);
    }

}
