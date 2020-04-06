package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity,Integer> {
    @Query(value = "SELECT * FROM comment WHERE id = ?1", nativeQuery = true)
    CommentEntity findById(int id);

    @Query(value = "SELECT * FROM comment WHERE text LIKE  %?1%", nativeQuery = true)
    List<CommentEntity> findByText(String text);

    @Query(value = "SELECT * FROM comment WHERE userId = ?1", nativeQuery = true)
    List<CommentEntity> findUserId(int userId);

    @Query(value = "SELECT * FROM comment WHERE meetingId = ?1", nativeQuery = true)
    List<CommentEntity> findByMeetingId(int meetingId);

    @Query (value = "INSERT INTO comment (userId,meetingId,text,createdAt) values = ?1, ?2, ?3, ?4", nativeQuery = true)
    CommentEntity insertComment(CommentEntity commentEntity);

    @Query (value = "UPDATE comment SET text = ?1 WHERE id = ?2", nativeQuery = true)
    CommentEntity updateComment(String text, int id);

    @Query (value = "DELETE FROM comment WHERE id = ?1", nativeQuery = true)
    void deleteComment(int id);
}
