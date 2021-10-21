package com.mybatisplus.autogenerator.controller;


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
    @Autowired
    private RoleMapper roleMapper;

    @RequestMapping("get")
    @ResponseBody
    public List<Role> get(int rid) {
        List<Role> roleList = new ArrayList<>();
        if (roleService != null) {
            roleList = roleService.list();
        }
        return roleList;
    }
}

