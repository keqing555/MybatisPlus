package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatisplus.bean.Role;
import com.mybatisplus.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private RoleService roleService;

    @Test
    public void save() {
        Role role = new Role();
        role.setRname("keqing");
        role.setSex("nv");
        role.setArea("liyue");
        role.setElementalForce("lei");
        role.setAge(18);
        role.setStar("★★★★★★★★★★");
        roleService.save(role);
    }

    @Test
    public void saveOrUpdate() {
        Role role = new Role();
        //修改需要id
        role.setRid(13);
        role.setRname("keqing");
        role.setSex("nv");
        role.setArea("liyue");
        role.setElementalForce("雷");
        role.setAge(18);
        role.setStar("★★★★★★★★★★");
        roleService.saveOrUpdate(role);
    }

    @Test
    public void getOne() {
        QueryWrapper<Role> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age", 18);
        //不抛出异常
        Role role = roleService.getOne(queryWrapper, false);
        System.out.println(role);
    }
}
