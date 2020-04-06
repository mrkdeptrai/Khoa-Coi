package com.webproject.enterprise.services.Room;

import com.webproject.enterprise.entity.RoomEntity;

import java.util.List;

public interface IRoom {

    List<RoomEntity> findAllRoom();

    RoomEntity findById(int id);

    List<RoomEntity> findRoomByStudentId(int studentId);

    List<RoomEntity> findRoomByName(String roomName);

    RoomEntity insertRoom(RoomEntity roomEntity);

    RoomEntity updateRoom(String roomName, int id);

    void deleteRoom(int id);
}
