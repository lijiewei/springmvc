package com.ljw.springmvc.dao.impl;

import com.ljw.springmvc.dao.IUserDao;
import com.ljw.springmvc.pojo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * @Description: 用户持久操作
 * @Author: Administrator
 * @CreateDate: 2019/4/3 22:02
 */
@Repository("userDao")
public class UserDaoImpl implements IUserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<User> listUser() {
        return hibernateTemplate.loadAll(User.class);
    }

    /**
     * 查询用户
     *
     * @param id
     * @return
     */
    @Override
    public User getUser(int id) {
        return hibernateTemplate.get(User.class,id);
    }

    /**
     * 保存一个用户
     *
     * @param user
     * @return
     */
    @Override
    public void saveUser(User user) {
        hibernateTemplate.save(user);
    }

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    @Override
    public void updateUser(User user) {
        hibernateTemplate.saveOrUpdate(user);
    }

    /**
     * 删除一个用户
     *
     * @param id
     * @return
     */
    @Override
    public void deleteUser(int id) {
        User user = new User();
        user.setId(id);
        hibernateTemplate.delete(user);

    }

}
