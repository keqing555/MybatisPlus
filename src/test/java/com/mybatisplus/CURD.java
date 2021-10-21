package com.mybatisplus;

import com.mybatisplus.bean.Role;
import com.mybatisplus.dao.RoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class CURD {
    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private Role role;
    @Test
    public void eqewq() {
        System.out.println(role);
    }
    /**
     * 新增
     */

    @Test
    public void insert() {
        Role role = new Role();
        role.setAge(19);
        role.setArea("稻妻");
        role.setRname("九条沙罗");
        role.setSex("女");
        role.setStar("★★★★");
        role.setElementalForce("雷系");
        roleMapper.insert(role);
        //mybatis新增时会自动获取自增主键，要先在主键上加上注解@TableId(type=IdType.AUTO)
        System.out.println(role.getRid());
    }

    /**
     * 修改，未传值的字段保持原有值
     */
    @Test
    public void update() {
        Role role = new Role();
        role.setRid(10);
        role.setRname("八神重子");
        role.setStar("★★★★★");
        role.setAge(1000);
        roleMapper.updateById(role);
    }
    /**
     * 删除,其他删除方法都差不多
     */
    @Test
    public void delete() {
        roleMapper.deleteById(8);
    }
    /**
     * 查询
     */
    @Test
    void selectAll() {
        //null表示查询所有
        List<Role> role = roleMapper.selectList(null);
        role.forEach(System.out::println);
    }

    //根据id查询
    @Test
    public void selectById() {
        Role role = roleMapper.selectById(10);
        System.out.println(role);
    }

    //根据多个id查询
    @Test
    public void selectByIds() {
        List<Integer> idList = Arrays.asList(1, 5, 8, 10);
        List<Role> roles = roleMapper.selectBatchIds(idList);
        roles.forEach(System.out::println);
    }

    //根据Map中传入的条件查询，每个条件都是and关系
    @Test
    public void selectByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("elemental_force", "雷系");
        map.put("star", "★★★★★");
        List<Role> roles = roleMapper.selectByMap(map);
        roles.forEach(System.out::println);
    }

}
