package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.bean.Role;
import com.mybatisplus.dao.RoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SelectPage {
    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void testPage() {
        QueryWrapper<Role> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("elemental_force", "雷系");
        Page<Role> page = new Page<>(1, 3);
        Page<Role> rolePage = roleMapper.selectPage(page, queryWrapper);
        System.out.println("当前页：" + rolePage.getCurrent());
        System.out.println("每页条数：" + rolePage.getSize());
        System.out.println("总条数：" + rolePage.getTotal());
        System.out.println("总页数：" + rolePage.getPages());
        List<Role> records = rolePage.getRecords();
        records.forEach(System.out::println);
    }
}
