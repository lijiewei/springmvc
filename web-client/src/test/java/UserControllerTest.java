import com.ljw.springmvc.constant.RestConstant;
import com.ljw.springmvc.controller.UserController;
import com.ljw.springmvc.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: Administrator
 * @CreateDate: 2019/4/5 17:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserControllerTest {


    @Autowired
    private UserController userController;

    @Test
    public void listUser() {
        userController.listUser();
    }

    @Test
    public void getUser() {
        userController.getUser(3);
    }

    @Test
    public void saveUser() {
        User user = new User("傻子",22, BigDecimal.valueOf(969));
        userController.saveUser(user);
    }

    @Test
    public void updateUser() {
        User user = new User("小王",22, BigDecimal.valueOf(969));
        user.setId(7);
        userController.updateUser(user);
    }

    @Test
    public void deleteUser() {
        userController.deleteUser(6);
    }
}