package com.webproject.enterprise.services.Room;

import com.webproject.enterprise.entity.RoomEntity;
import com.webproject.enterprise.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomImpl implements IRoom {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<RoomEntity> findAllRoom() {
        List<RoomEntity> findAllRoom = roomRepository.findAll();
        return findAllRoom;
    }

    @Override
    public RoomEntity findById(int id) {
        RoomEntity findById = roomRepository.findById(id);
        return findById;
    }

    @Override
    public List<RoomEntity> findRoomByStudentId(int studentId) {
        List<RoomEntity> findRoomByStudentId = roomRepository.findRoomByStudentId(studentId);
        return findRoomByStudentId;
    }

    @Override
    public List<RoomEntity> findRoomByName(String roomName) {
        List<RoomEntity> findRoomByName = roomRepository.findRoomByName(roomName);
        return findRoomByName;
    }

    @Override
    public RoomEntity insertRoom(RoomEntity roomEntity) {
        return roomRepository.insertRoom(roomEntity);
    }

    @Override
    public RoomEntity updateRoom(String roomName, int id) {
        return roomRepository.updateRoom(roomName,id);
    }

    @Override
    public void deleteRoom(int id) {
        roomRepository.deleteRoom(id);
    }
}
