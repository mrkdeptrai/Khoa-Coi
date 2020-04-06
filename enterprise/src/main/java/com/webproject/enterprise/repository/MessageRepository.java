package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity,Integer> {
    @Query(value = "SELECT * FROM message WHERE id = ?1", nativeQuery = true)
    MessageEntity findById(int id);

    @Query(value = "SELECT * FROM message WHERE text LIKE  %?1%", nativeQuery = true)
    List<MessageEntity> findByText(String text);

    @Query(value = "SELECT * FROM message WHERE userId = ?1", nativeQuery = true)
    List<MessageEntity> findByUserId(int userId);

    @Query(value = "SELECT * FROM message WHERE roomId = ?1", nativeQuery = true)
    List<MessageEntity> findByRoomId(int roomId);

    @Query (value = "INSERT INTO message (userId,roomId,text,createdAt) values = ?1, ?2, ?3, ?4", nativeQuery = true)
    MessageEntity insertMessage(MessageEntity messageEntity);

    @Query (value = "UPDATE message SET text = ?1 WHERE id = ?2", nativeQuery = true)
    MessageEntity updateMessage(String text, int id);

    @Query (value = "DELETE FROM message WHERE id = ?1", nativeQuery = true)
    void deleteMessage(int id);
}
