package com.ljw.springmvc.service.impl;

import com.ljw.springmvc.dao.IUserDao;
import com.ljw.springmvc.pojo.User;
import com.ljw.springmvc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Author: Administrator
 * @CreateDate: 2019/4/3 22:00
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public List<User> listUser() {
        return userDao.listUser();
    }

    /**
     * 查询用户
     *
     * @param id
     * @return
     */
    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    /**
     * 保存一个用户
     *
     * @param user
     * @return
     */
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    /**
     * 删除一个用户
     *
     * @param id
     * @return
     */
    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

}
