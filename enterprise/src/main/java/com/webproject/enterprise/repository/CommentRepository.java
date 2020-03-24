package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity,Integer> {
    @Query(value = "SELECT * FROM tblComment WHERE id = ?1", nativeQuery = true)
    CommentEntity findById(int id);

    @Query(value = "SELECT * FROM tblComment WHERE title LIKE  %?1", nativeQuery = true)
    List<CommentEntity> findByTitle(String title);

    @Query(value = "SELECT * FROM tblComment WHERE userID = ?1", nativeQuery = true)
    List<CommentEntity> findUserComment(int userID);

    @Query(value = "SELECT * FROM tblComment WHERE postID = ?1", nativeQuery = true)
    List<CommentEntity> findByPost(int postID);

    @Query (value = "INSERT INTO tblComment (title,userID,postID,createdAt,updatedAt) values = ?1, ?2, ?3, ?4,?5", nativeQuery = true)
    CommentEntity insertComment(CommentEntity commentEntity);

    @Query (value = "UPDATE tblComment SET title = ?1, updatedAt = ?2 WHERE id = ?3", nativeQuery = true)
    CommentEntity updateComment(String title, String updatedAt, int id);
}
