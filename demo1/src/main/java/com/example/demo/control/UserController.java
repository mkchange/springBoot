package com.example.demo.control;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserDao userdao;
    @RequestMapping("/user")
    public String getUSer(){
        User users = userdao.findById();
        System.out.println(users);
        return "users";
    }
}
