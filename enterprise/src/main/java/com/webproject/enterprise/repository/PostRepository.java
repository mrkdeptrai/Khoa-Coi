package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer> {
    @Query(value = "SELECT * FROM tblPost WHERE id = ?1", nativeQuery = true)
    PostEntity findById(int id);

    @Query(value = "SELECT * FROM tblPost WHERE title LIKE  %?1", nativeQuery = true)
    List<PostEntity> findByTitle(String title);

    @Query(value = "SELECT * FROM tblPost WHERE userID = ?1", nativeQuery = true)
    List<PostEntity> findUserPost(int userID);

    @Query(value = "SELECT * FROM tblPost WHERE classID = ?1", nativeQuery = true)
    List<PostEntity> findByClass(int classID);

    @Query (value = "INSERT INTO tblPost (title,userID,classID,createdAt,updatedAt) values = ?1, ?2, ?3, ?4,?5", nativeQuery = true)
    PostEntity insertPost(PostEntity postEntity);

    @Query (value = "UPDATE tblPost SET title = ?1, updatedAt = ?2 WHERE id = ?3", nativeQuery = true)
    PostEntity updatePost(String title, String updatedAt, int id);
}
