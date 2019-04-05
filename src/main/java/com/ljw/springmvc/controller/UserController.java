package com.ljw.springmvc.controller;

import com.ljw.springmvc.pojo.User;
import com.ljw.springmvc.service.IUserService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * @Description: 用户控制层
 * @Author: Administrator
 * @CreateDate: 2019/4/2 23:47
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;



    @GetMapping("/list")
    public ResponseEntity<List<User>> listUser(){
        List<User> dataList = userService.listUser();
        if(CollectionUtils.isEmpty(dataList)){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(dataList);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") int id){
        User user = userService.getUser(id);
        if(user == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveUser(@RequestBody User user, UriComponentsBuilder uriComponentsBuilder){
        userService.saveUser(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponentsBuilder.path("/user/get/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateUser(@RequestBody User user){
        userService.updateUser(user);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
