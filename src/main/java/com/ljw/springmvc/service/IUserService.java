package com.ljw.springmvc.service;

import com.ljw.springmvc.pojo.User;
import org.jboss.logging.Param;

import java.util.List;

/**
 * @Description: 用户处理
 * @Author: Administrator
 * @CreateDate: 2019/4/3 22:00
 */
public interface IUserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> listUser();


    /**
     * 查询用户
     * @param id
     * @return
     */
    User getUser(int id);

    /**
     * 保存一个用户
     * @param user
     * @return
     */
    void saveUser(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    void updateUser(User user);

    /**
     * 删除一个用户
     * @param id
     * @return
     */
    void deleteUser(int id);

}
