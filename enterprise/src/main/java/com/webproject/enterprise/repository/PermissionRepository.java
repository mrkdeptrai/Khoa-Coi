package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<PermissionEntity, Integer> {

    @Query(value = "SELECT * FROM tblPermission WHERE id = ?1", nativeQuery = true)
    PermissionEntity findById(int id);

    @Query(value = "SELECT * FROM tblPermission WHERE title LIKE = ?1", nativeQuery = true)
    PermissionEntity findByTitle(String title);

    @Query(value = "INSERT INTO tblPermission(title,createdAt,updatedAt) values = ?1, ?2, ?3", nativeQuery = true)
    PermissionEntity insertPermission(PermissionEntity permissionEntity);

    @Query(value = "UPDATE tblPermission SET title = ?1, updatedAt = ?2 WHERE id = ?3", nativeQuery = true)
    PermissionEntity updatePermission(String title, String updatedAt, int id);

}


