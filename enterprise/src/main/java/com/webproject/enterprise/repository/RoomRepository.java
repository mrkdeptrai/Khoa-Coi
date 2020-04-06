package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity,Integer> {

    @Query(value = "SELECT * FROM room WHERE id = ?1", nativeQuery = true)
    RoomEntity findById(int id);

    @Query(value = "SELECT * FROM room WHERE studentId = ?1", nativeQuery = true)
    List<RoomEntity> findRoomByStudentId(int studentId);

    @Query(value = "SELECT * FROM room WHERE roomName = ?1", nativeQuery = true)
    List<RoomEntity> findRoomByName(String roomName);

    @Query (value = "INSERT INTO room (studentId,roomName) values = ?1, ?2", nativeQuery = true)
    RoomEntity insertRoom(RoomEntity roomEntity);

    @Query (value = "UPDATE room SET roomName = ?1 WHERE id = ?2", nativeQuery = true)
    RoomEntity updateRoom(String roomName, int id);

    @Query (value = "DELETE FROM room WHERE id = ?1", nativeQuery = true)
    void deleteRoom(int id);

}
