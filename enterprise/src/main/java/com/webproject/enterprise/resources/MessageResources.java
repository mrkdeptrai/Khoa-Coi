package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.CommentEntity;
import com.webproject.enterprise.entity.MessageEntity;
import com.webproject.enterprise.services.Message.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/Message")
public class MessageResources {

    @Autowired
    private IMessage messageService;

    @GetMapping()
    public ResponseEntity<List<MessageEntity>> findAllMessage(){
        List<MessageEntity> listMessage = messageService.findAllMessage();
        return ResponseObjectFactory.toResult(listMessage, HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<MessageEntity> findMessageById(@RequestParam int id){
        MessageEntity findMessageById = messageService.findById(id);
        return ResponseObjectFactory.toResult(findMessageById, HttpStatus.OK);
    }

    @GetMapping("/text")
    public ResponseEntity<List<MessageEntity>> findMessageByText(@RequestParam String text){
        List<MessageEntity> findMessageByText = messageService.findByText(text);
        return ResponseObjectFactory.toResult(findMessageByText, HttpStatus.OK);
    }

    @GetMapping("/userId")
    public ResponseEntity<List<MessageEntity>> findMessageByUserId(@RequestParam int userId){
        List<MessageEntity> findMessageByUserId = messageService.findByUserId(userId);
        return ResponseObjectFactory.toResult(findMessageByUserId, HttpStatus.OK);
    }

    @GetMapping("/roomId")
    public ResponseEntity<List<MessageEntity>> findMessageByRoomId(@RequestParam int roomId){
        List<MessageEntity> findMessageByRoomId = messageService.findByRoomId(roomId);
        return ResponseObjectFactory.toResult(findMessageByRoomId, HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageEntity> updateMessage(@RequestParam String text, @RequestParam int id){
        messageService.updateMessage(text, id);
        return ResponseObjectFactory.toResult("Update Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageEntity> insertMessage(@RequestBody MessageEntity messageEntity){
        messageService.insertMessage(messageEntity);
        return ResponseObjectFactory.toResult("Insert Successfully", HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity<MessageEntity> deleteMessage(@RequestParam int id){
        messageService.deleteMessage(id);
        return ResponseObjectFactory.toResult("Delete Successfully", HttpStatus.OK);
    }

}
