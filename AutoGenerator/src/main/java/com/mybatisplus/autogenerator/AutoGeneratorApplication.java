package com.mybatisplus.autogenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatisplus.autogenerator.mapper")
public class AutoGeneratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoGeneratorApplication.class, args);
    }
}
