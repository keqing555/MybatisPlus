package com.mybatisplus;

import com.mybatisplus.bean.Role;
import com.mybatisplus.dao.RoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.util.List;

@SpringBootTest
public class QueryWrapperTest {


    @Autowired
    private RoleMapper roleMapper;
    /**
     * 条件构造器
     */
    QueryWrapper<Role> queryWrapper = new QueryWrapper<>();

    @Test
    public void selectList() {
        queryWrapper.eq("elemental_force", "雷系");
        queryWrapper.eq("sex", "女");
        List<Role> roles = roleMapper.selectList(queryWrapper);
        System.out.println(roles);
    }

    @Test
    public void selectList2() {
        queryWrapper.like("elemental_force", "雷").gt("age", "20").le("age", "1000").orderByDesc("age");
        List<Role> roles = roleMapper.selectList(queryWrapper);
        roles.forEach(System.out::println);
    }


}
