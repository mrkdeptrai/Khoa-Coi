package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.CommentEntity;
import com.webproject.enterprise.entity.MeetingEntity;
import com.webproject.enterprise.entity.RoomEntity;
import com.webproject.enterprise.services.Meeting.IMeeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/Meeting")
public class MeetingResources {

    @Autowired
    private IMeeting meetingService;

    @GetMapping()
    public ResponseEntity<List<MeetingEntity>> findAllMeeting(){
        List<MeetingEntity> listMeeting = meetingService.findAllMeeting();
        return ResponseObjectFactory.toResult(listMeeting, HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<MeetingEntity> findMeetingById(@RequestParam int id){
        MeetingEntity findMeetingById = meetingService.findById(id);
        return ResponseObjectFactory.toResult(findMeetingById, HttpStatus.OK);
    }

    @GetMapping("/title")
    public ResponseEntity<List<MeetingEntity>> findMeetingByTitle(@RequestParam String title){
        List<MeetingEntity> findMeetingByTitle = meetingService.findByTitle(title);
        return ResponseObjectFactory.toResult(findMeetingByTitle, HttpStatus.OK);
    }

    @GetMapping("/roomId")
    public ResponseEntity<List<MeetingEntity>> findMeetingByRoomId(@RequestParam int roomId){
        List<MeetingEntity> findMeetingByRoomId = meetingService.findByRoomId(roomId);
        return ResponseObjectFactory.toResult(findMeetingByRoomId, HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MeetingEntity> updateMeeting(@RequestParam String title,@RequestParam String body,@RequestParam String dateAt,@RequestParam int id){
        meetingService.updateMeeting(title, body, dateAt, id);
        return ResponseObjectFactory.toResult("Update Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MeetingEntity> insertMeeting(@RequestBody MeetingEntity meetingEntity){
        meetingService.insertMeeting(meetingEntity);
        return ResponseObjectFactory.toResult("Insert Successfully", HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity<MeetingEntity> deleteMeeting(@RequestParam int id){
        meetingService.deleteMeeting(id);
        return ResponseObjectFactory.toResult("Delete Successfully", HttpStatus.OK);
    }

}
