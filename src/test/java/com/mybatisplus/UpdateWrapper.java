package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatisplus.bean.Role;
import com.mybatisplus.dao.RoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UpdateWrapper {
    @Autowired
    private RoleMapper roleMapper;

    QueryWrapper<Role> queryWrapper = new QueryWrapper<>();

    @Test
    public void update() {
        queryWrapper.eq("rname", "雷神");
        Role role = new Role();
        role.setAge(3000);
        int rows = roleMapper.update(role, queryWrapper);
        System.out.println("受影响的行数：" + rows);
    }
}
