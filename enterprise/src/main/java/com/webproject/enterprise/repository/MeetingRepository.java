package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.MeetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeetingRepository extends JpaRepository<MeetingEntity, Integer> {

    @Query(value = "SELECT * FROM meeting WHERE id = ?1", nativeQuery = true)
    MeetingEntity findById(int id);

    @Query(value = "SELECT * FROM meeting WHERE title LIKE %?1%", nativeQuery = true)
    List<MeetingEntity> findByTitle(String title);

    @Query(value = "SELECT * FROM meeting WHERE roomId = ?1", nativeQuery = true)
    List<MeetingEntity> findByRoomId(int roomId);

    @Query (value = "INSERT INTO meeting (roomId,title,body,dateAt) values = ?1, ?2, ?3, ?4", nativeQuery = true)
    MeetingEntity insertMeeting(MeetingEntity meetingEntity);

    @Query (value = "UPDATE meeting SET title = ?1, body = ?2, dateAt = ?3 WHERE id = ?4", nativeQuery = true)
    MeetingEntity updateMeeting(String title, String body, String dateAt, int id);

    @Query (value = "DELETE FROM meeting WHERE id = ?1", nativeQuery = true)
    void deleteMeeting(int id);
}
