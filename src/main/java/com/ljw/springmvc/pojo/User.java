package com.ljw.springmvc.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @Description:
 * @Author: Administrator
 * @CreateDate: 2019/4/2 23:08
 */
@Data
@Entity
@Table(name="t_user")
public class User {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="salary")
    private BigDecimal salary;
}
