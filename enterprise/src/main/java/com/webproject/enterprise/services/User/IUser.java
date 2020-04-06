package com.webproject.enterprise.services.User;


import com.webproject.enterprise.entity.UserEntity;

import java.util.List;

public interface IUser {

    List<UserEntity> findAllUser();

    UserEntity findById(int id);

    UserEntity findByEmail(String email);

    List<UserEntity> searchEmail(String email);

    List<UserEntity> findByName(String name);

    List<UserEntity> findAllTutor();

    List<UserEntity> findAllStudent();

    UserEntity checkLogin(String email, String password);

    UserEntity insertUser(UserEntity userEntity) throws Exception;

    UserEntity updateUser(String password, String name, String dob, String gender, String phone, String address, String avatar,int role, int id);
}
