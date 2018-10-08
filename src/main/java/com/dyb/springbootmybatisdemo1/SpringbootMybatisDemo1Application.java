package com.dyb.springbootmybatisdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dyb.springbootmybatisdemo1.dao")/* 或者在dao层中的每个类前加@Mapper注解*/
public class SpringbootMybatisDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDemo1Application.class, args);
    }
}
