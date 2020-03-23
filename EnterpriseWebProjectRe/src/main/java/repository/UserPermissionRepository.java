package repository;


import entity.UserPermissionEntity;
import model.UserPermissionDTO;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserPermissionRepository {

    @Query(value = "SELECT * FROM tblUserPermission WHERE id = ?1", nativeQuery = true)
    UserPermissionEntity findById(int id);

    @Query(value = "SELECT * FROM tblUserPermission WHERE userID = ?1", nativeQuery = true)
    UserPermissionEntity findByUserID(int userID);

    @Query(value = "SELECT * FROM tblUserPermission WHERE permissionID = ?1", nativeQuery = true)
    UserPermissionEntity findByPermissionID(int permissionID);

    @Query (value = "INSERT INTO tblUserPermission (userID,permissionID,status,createdAt,updatedAt) values = ?1, ?2, ?3, ?4, ?5", nativeQuery = true)
    UserPermissionDTO insertUserPermission(UserPermissionDTO userPermissionDTO);

    @Query (value = "UPDATE tblUserPermission SET status = ?1, updatedAt = ?2 WHERE id = ?3", nativeQuery = true)
    UserPermissionDTO updateUserPermission(String status,String updatedAt, int id);
}
