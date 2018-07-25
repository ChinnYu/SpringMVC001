package com.jason.springmvc08.dao;

import com.jason.springmvc08.entiity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: SpringMVC01
 * @description:用戶數據訪問對象
 * @author: Liu
 * @create: 2018-07-25
 */
@Repository
public class UserDAO implements IUserDAO {
    private static List<User> users = new ArrayList<User>();
    static {
        users.add(new User(1,"小王","台南","095595995"));
        users.add(new User(1,"小張","台北","098858995"));
        users.add(new User(1,"小亮","台中","095475595"));
        users.add(new User(1,"小立","台東","095752572"));
        users.add(new User(1,"小高","新竹","099645777"));
    }

    /**
        * 獲得所有
        * @return
        */
    public List<User> getAll(){
        return users;
    }

    public User getUserById(int id){
        for(User user:users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public boolean add(User user){
        users.add(user);
        return true;
    }

    public boolean delete(int id){
        users.remove(getUserById(id));
        return true;
    }

    public boolean update(User user){
        User oldUser = getUserById(user.getId());
        oldUser.setName(user.getName());
        oldUser.setAddress(user.getAddress());
        oldUser.setPhone(user.getPhone());
        return true;
    }
}
