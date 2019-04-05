package com.ljw.springmvc.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: Administrator
 * @CreateDate: 2019/4/2 23:08
 */
@Data
public class User {

    private int id;

    private String name;

    private int age;

    private BigDecimal salary;

    public User() {

    }

    public User(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
