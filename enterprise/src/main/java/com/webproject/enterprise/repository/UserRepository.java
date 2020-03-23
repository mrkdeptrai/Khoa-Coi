package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Query(value = "SELECT * FROM tblUser WHERE id = ?1", nativeQuery = true)
    UserEntity findById(int id);

    @Query(value = "SELECT * FROM tblUser WHERE email LIKE  %?1", nativeQuery = true)
    UserEntity findByEmail(String email);

    @Query(value = "SELECT * FROM tblUser WHERE name LIKE  %?1", nativeQuery = true)
    UserEntity findByName(String name);

    @Query(value = "SELECT tblPermission.permissionID, tblPermission.status FROM tblPermission INNER JOIN tblUser on tblPermission.userID = tblUser.id WHERE email = ?1,password = ?2", nativeQuery = true)
    List<Object[]> checkLogin(String email, String password);

//    @Query(value = "SELECT id FROM tblUser WHERE email = ?1,password = ?2", nativeQuery = true)
//    Integer checkLogin(String email, String password);
//
//    @Query(value = "SELECT permissionID, status FROM tblUserPermission WHERE userID = ?1", nativeQuery = true)
//    List<Object[]> checkPermission(int id);

    @Query(value = "SELECT * FROM tblUser WHERE userID IN (SELECT userID from tblUserPermission WHERE permissionID = 1 AND status = 1)", nativeQuery = true)
    List<UserEntity> findAllTutor();

    @Query(value = "SELECT * FROM tblUser WHERE userID IN (SELECT userID from tblUserPermission WHERE permissionID = 2 AND status = 1)", nativeQuery = true)
    List<UserEntity> findAllStudent();

    @Query (value = "INSERT INTO tblUser(email,password,name,dob,gender,phone,address,avatar,createdAt,updatedAt) values = ?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10", nativeQuery = true)
    UserEntity insertUser(UserEntity userEntity);

    @Query (value = "UPDATE tblPermission SET password = ?1, name = ?2, dob = ?3, gender = ?4, phone = ?5, address = ?6, avatar = ?7, updatedAt = ?8 WHERE id = ?9", nativeQuery = true)
    UserEntity updateUser(String password, String name, String dob, String gender, int phone, String address, String avatar, String updatedAt, int id);
}
