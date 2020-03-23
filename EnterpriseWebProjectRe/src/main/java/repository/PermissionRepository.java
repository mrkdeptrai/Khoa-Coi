package repository;

import entity.PermissionEntity;
import model.PermissionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface PermissionRepository extends JpaRepository<PermissionEntity, Integer> {

    @Query(value = "SELECT * FROM tblPermission WHERE id = ?1", nativeQuery = true)
    PermissionEntity findById(int id);

    @Query(value = "SELECT * FROM tblPermission WHERE title LIKE = ?1", nativeQuery = true)
    PermissionEntity findByTitle(String title);

    @Query(value = "INSERT INTO tblPermission(title,createdAt,updatedAt) values = ?1, ?2, ?3", nativeQuery = true)
    PermissionDTO insertPermission(PermissionDTO permissionDTO);

    @Query(value = "UPDATE tblPermission SET title = ?1, updatedAt = ?2 WHERE id = ?3", nativeQuery = true)
    PermissionDTO updatePermission(String title, String updatedAt, int id);

}


