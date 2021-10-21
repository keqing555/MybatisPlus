package com.mybatisplus.autogenerator.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatisplus.autogenerator.bean.Role;
import com.mybatisplus.autogenerator.mapper.RoleMapper;
import com.mybatisplus.autogenerator.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mark
 * @since 2021-10-21
 */
@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("get")
    public Role get(int rid) {
        Role role = new Role();
        if (roleService != null) {
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.eq("rid", rid);
            role = roleService.getOne(queryWrapper);
        }
        return role;
    }
}

