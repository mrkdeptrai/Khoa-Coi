package com.webproject.enterprise.services.User;

import com.webproject.enterprise.entity.UserEntity;
import com.webproject.enterprise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserImpl implements IUser {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> findAllUser() {
        List<UserEntity> listUser = userRepository.findAll();
        return listUser;
    }

    @Override
    public UserEntity findById(int id) {
        UserEntity findUserById = userRepository.findById(id);
        return findUserById;
    }

    @Override
    public UserEntity findByEmail(String email) {
        UserEntity findUserByEmail = userRepository.findByEmail(email);
        return findUserByEmail;
    }

    @Override
    public UserEntity findByName(String name) {
        UserEntity findUserByName = userRepository.findByName(name);
        return findUserByName;
    }

    @Override
    public List<UserEntity> findAllTutor() {
        List<UserEntity> listTutor = userRepository.findAllTutor();
        return listTutor;
    }

    @Override
    public List<UserEntity> findAllStudent() {
        List<UserEntity> listStudent = userRepository.findAllStudent();
        return listStudent;
    }

//    @Override
//    public List<Object[]> checkLogin(String email, String password) {
//        int permissionID = 0;
//        int status = 0;
//        List<Object[]> list = checkLogin(email, password);
//        for (Object[] obj : list) {
//            permissionID = obj[0];
//            status = obj[1];
//        }
//        return list;
//    }


    @Override
    public UserEntity insertUser(UserEntity userEntity) {
        return userRepository.insertUser(userEntity);
    }

    @Override
    public UserEntity updateUser(String password, String name, String dob, String gender, int phone, String address, String avatar, String updatedAt, int id) {
        return userRepository.updateUser(password, name, dob, gender, phone, address, avatar, updatedAt, id);
    }
}
