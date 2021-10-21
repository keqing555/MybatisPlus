package com.mybatisplus.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //告诉spring这个类要创建实例
@Data   //自动生成方法：get，set，toString，equal，hashcode
@NoArgsConstructor  //生成一个无参构造
@AllArgsConstructor //生成一个全参构造
@TableName(value = "role")    //指定表名
public class Role {
    @TableId(type = IdType.AUTO)   //mybatisplus根据雪花算法自动生成一个64位的不重复id
    private int rid;
    private String rname;
    private String area;
    private int age;
    private String sex;
    private String star;
    @TableField(value = "elemental_force")    //字段名与属性名不一致时指定
    private String elementalForce;
    @TableField(exist = false)  //表中不存在的字段，操作表时忽略该字段
    @Value("匣里龙吟")  //设置默认值
    private String weapon;
}
