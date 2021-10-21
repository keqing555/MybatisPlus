package com.mybatisplus.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //自动生成方法：get，set，toString，equal，hashcode
@NoArgsConstructor  //生成一个无参构造
@AllArgsConstructor //生成一个全参构造
public class Role {
    private int rid;
    private String rname;
    private String area;
    private int age;
    private String sex;
    private String star;
    private String elementalForce;
}
