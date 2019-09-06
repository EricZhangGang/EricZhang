package com.zhang.service;

import com.zhang.model.User;

import java.util.List;

public interface IUserService {

    public User selectUser(long userId);
      List<User> findAll();
      User findUserName(String username,String password);
      List<User> fuzzyQuery(String fuzzy);
      User getById(Long id);
      /*
      * insert
      * */
      void insert(User entity);
      /*
      * update
      * */
      void update(User entity);
      /*
      * delete
      * */
      void delete(Long id);
}
