package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Query(value = "SELECT * FROM user WHERE id = ?1", nativeQuery = true)
    UserEntity findById(int id);

    @Query(value = "SELECT * FROM user WHERE email = ?1", nativeQuery = true)
    UserEntity findByEmail(String email);

    @Query(value = "SELECT * FROM user WHERE email = %?1%", nativeQuery = true)
    List<UserEntity> searchEmail(String emailSimilar);

    @Query(value = "SELECT * FROM user WHERE name LIKE  %?1%", nativeQuery = true)
    List<UserEntity> findByName(String name);

//    @Query(value = "SELECT * FROM tblUser WHERE email = ?1 AND password = md5(?2)", nativeQuery = true)
//    UserEntity checkLogin(String email, String password);

//    @Query(value = "SELECT id FROM tblUser WHERE email = ?1,password = ?2", nativeQuery = true)
//    Integer checkLogin(String email, String password);
//
//    @Query(value = "SELECT permissionID, status FROM tblUserPermission WHERE userID = ?1", nativeQuery = true)
//    List<Object[]> checkPermission(int id);

    @Query(value = "SELECT * FROM user WHERE role = 2", nativeQuery = true)
    List<UserEntity> findAllTutor();

    @Query(value = "SELECT * FROM user WHERE role = 1", nativeQuery = true)
    List<UserEntity> findAllStudent();

    @Query(value = "SELECT * FROM user WHERE role = 3", nativeQuery = true)
    List<UserEntity> findAllAdmin();

    @Query (value = "INSERT INTO user(email,password,name,avatar,role,tutorId) values = ?1, ?2, ?3, ?4, ?5, ?6", nativeQuery = true)
    UserEntity insertUser(UserEntity userEntity);

    @Query (value = "UPDATE user SET password = ?1, name = ?2, avatar = ?3 WHERE id = ?4", nativeQuery = true)
    UserEntity updateUser(String password, String name, String avatar, int id);
}
