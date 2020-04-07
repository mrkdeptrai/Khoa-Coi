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
    public List<UserEntity> searchEmail(String email){
        List<UserEntity> searchEmail = userRepository.searchEmail(email);
        return searchEmail;
    }

    @Override
    public List<UserEntity> findByName(String name) {
        List<UserEntity> findUserByName = userRepository.findByName(name);
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

    @Override
    public UserEntity insertUser(UserEntity userEntity) throws Exception {
        UserEntity checkEmail = userRepository.findByEmail(userEntity.getEmail());
        if(checkEmail != null){
           throw new Exception("Email have been created !");
        }
        return userRepository.insertUser(userEntity);
    }

    @Override
    public UserEntity updateUser(String password, String name, String avatar, int id) {
        return userRepository.updateUser(password, name, avatar, id);
    }
}
