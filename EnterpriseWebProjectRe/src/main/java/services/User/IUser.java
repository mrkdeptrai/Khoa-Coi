package services.User;

import entity.UserEntity;
import model.UserDTO;

import java.util.List;

public interface IUser {

    List<UserEntity> findAllUser();

    UserEntity findById(int id);

    UserEntity findByEmail(String email);

    UserEntity findByName(String name);

    List<UserEntity> findAllTutor();

    List<UserEntity> findAllStudent();

//    List<Object[]> checkLogin(String email, String password);

    UserDTO insertUser(UserDTO permissionDTO);

    UserDTO updateUser (String password,String name,String dob, String gender, int phone,String address,String avatar,String updatedAt, int id);
}
