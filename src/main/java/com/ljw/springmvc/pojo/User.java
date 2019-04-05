package com.ljw.springmvc.pojo;

import lombok.Data;

import javax.persistence.*;
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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="salary")
    private BigDecimal salary;
}
