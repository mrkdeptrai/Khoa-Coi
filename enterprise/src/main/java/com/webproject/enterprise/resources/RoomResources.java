package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.RoomEntity;
import com.webproject.enterprise.services.Room.IRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/Room")
public class RoomResources {

    @Autowired
    private IRoom roomService;

    @GetMapping()
    public ResponseEntity<List<RoomEntity>> findAllRoom(){
        List<RoomEntity> listRoom = roomService.findAllRoom();
        return ResponseObjectFactory.toResult(listRoom, HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<RoomEntity> findRoomById(@RequestParam int id){
        RoomEntity findRoomById = roomService.findById(id);
        return ResponseObjectFactory.toResult(findRoomById, HttpStatus.OK);
    }

    @GetMapping("/studentId")
    public ResponseEntity<List<RoomEntity>> findRoomByStudentId(@RequestParam int studentId){
        List<RoomEntity> findRoomByStudentId = roomService.findRoomByStudentId(studentId);
        return ResponseObjectFactory.toResult(findRoomByStudentId, HttpStatus.OK);
    }

    @GetMapping(value = "/roomName")
    public ResponseEntity<List<RoomEntity>> findRoomByName(@RequestParam String roomName){
        List<RoomEntity> findRoomByName = roomService.findRoomByName(roomName);
        return ResponseObjectFactory.toResult(findRoomByName, HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RoomEntity> updateRoom(@RequestParam String roomName, @RequestParam int id){
        roomService.updateRoom(roomName,id);
        return ResponseObjectFactory.toResult("Update Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RoomEntity> insertRoom(@RequestBody RoomEntity roomEntity){
        roomService.insertRoom(roomEntity);
        return ResponseObjectFactory.toResult("Insert Successfully", HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity<RoomEntity> deleteRoom(@RequestParam int id){
        roomService.deleteRoom(id);
        return ResponseObjectFactory.toResult("Delete Successfully", HttpStatus.OK);
    }
}
