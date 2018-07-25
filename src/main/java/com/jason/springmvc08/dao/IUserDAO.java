package com.jason.springmvc08.dao;

import com.jason.springmvc08.entiity.User;

import java.util.List;
/**
 * @program: SpringMVC01
 * @description:用戶數據訪問對象
 * @author: Liu
 * @create: 2018-07-25
 */
public interface IUserDAO {
    List<User> getAll();

    User getUserById(int id);

    boolean add(User user);

    boolean delete(int id);

    boolean update(User user);
}
