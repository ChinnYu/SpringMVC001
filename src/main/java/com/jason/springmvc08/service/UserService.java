package com.jason.springmvc08.service;

import com.jason.springmvc08.dao.IUserDAO;
import com.jason.springmvc08.entiity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: SpringMVC01
 * @description:用戶業務
 * @author: Liu
 * @create: 2018-07-25
 */
@Service
public class UserService {
    @Autowired
    IUserDAO userdao ;//這邊自動注入
    public List<User> queryAllUsers(){
        return userdao.getAll();
    }

    public User getUserById(int id){
        return userdao.getUserById(id);
    }

    public boolean deleteUser(int id){
        return userdao.delete(id);
    }
    public boolean addUser(User user){
        return userdao.add(user);
    }
    public boolean editUser(User user){
        return userdao.update(user);
    }
}
