package com.ljw.springmvc.controller;

import com.ljw.springmvc.constant.RestConstant;
import com.ljw.springmvc.pojo.User;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @Description: 模拟客户端
 * @Author: Administrator
 * @CreateDate: 2019/4/5 16:51
 */
@Controller("userController")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    public void listUser() {
        String url = RestConstant.REST_SERVICE_URI + "/user/list";
        ResponseEntity<List> entity = restTemplate.getForEntity(url, List.class);
        List dataList = entity.getBody();
        if (CollectionUtils.isNotEmpty(dataList)) {
            dataList.forEach(System.out::println);
        }
    }

    public void getUser(int id) {
        String url = RestConstant.REST_SERVICE_URI + "/user/get/" + id;
        ResponseEntity<User> entity = restTemplate.getForEntity(url, User.class);
        User user = entity.getBody();
        System.out.println(user);
    }

    public void saveUser(User user) {
        String url = RestConstant.REST_SERVICE_URI + "/user/save";
        URI uri = restTemplate.postForLocation(url, user, User.class);
        System.out.println("Location : " + uri.toASCIIString());
    }

    public void updateUser(User user) {
        String url = RestConstant.REST_SERVICE_URI + "/user/update";
        restTemplate.put(url, user);
        System.out.println(user);
    }

    public void deleteUser(int id) {
        String url = RestConstant.REST_SERVICE_URI + "/user/delete/" + id;
        restTemplate.delete(url);
    }
}
