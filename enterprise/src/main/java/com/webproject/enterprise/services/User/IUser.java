package com.webproject.enterprise.services.User;


import com.webproject.enterprise.entity.UserEntity;

import java.util.List;

public interface IUser {

    List<UserEntity> findAllUser();

    UserEntity findById(int id);

    UserEntity findByEmail(String email);

    List<UserEntity> findByName(String name);

    List<UserEntity> findAllTutor();

    List<UserEntity> findAllStudent();

    Integer checkLogin(String email, String password);

    UserEntity insertUser(UserEntity userEntity);

    UserEntity updateUser(String password, String name, String dob, String gender, int phone, String address, String avatar,int role, int status, String updatedAt, int id);
}
