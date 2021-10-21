package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatisplus.bean.Role;
import com.mybatisplus.dao.RoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DeleteWrapper {
    @Autowired
    private RoleMapper roleMapper;

    QueryWrapper<Role> queryWrapper = new QueryWrapper<>();

    @Test
    public void delete() {
        queryWrapper.eq("age", "6000");
        int rows = roleMapper.delete(queryWrapper);
        System.out.println("受影响的行数：" + rows);
    }

}
