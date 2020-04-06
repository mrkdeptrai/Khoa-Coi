package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.CommentEntity;
import com.webproject.enterprise.services.Comment.IComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/Comment")
public class CommentResources {

    @Autowired
    private IComment commentService;

    @GetMapping()
    public ResponseEntity<List<CommentEntity>> findAllComment(){
        List<CommentEntity> listComment = commentService.findAllComment();
        return ResponseObjectFactory.toResult(listComment, HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<CommentEntity> findCommentById(@RequestParam int id){
        CommentEntity findCommentById = commentService.findById(id);
        return ResponseObjectFactory.toResult(findCommentById, HttpStatus.OK);
    }

    @GetMapping("/text")
    public ResponseEntity<List<CommentEntity>> findCommentByBody(@RequestParam String text){
        List<CommentEntity> findCommentByBody = commentService.findByText(text);
        return ResponseObjectFactory.toResult(findCommentByBody, HttpStatus.OK);
    }

    @GetMapping("/userId")
    public ResponseEntity<List<CommentEntity>> findCommentByUserId(@RequestParam int userId){
        List<CommentEntity> findCommentByUserId = commentService.findByUserId(userId);
        return ResponseObjectFactory.toResult(findCommentByUserId, HttpStatus.OK);
    }

    @GetMapping("/meetingId")
    public ResponseEntity<List<CommentEntity>> findCommentByMeetingId(@RequestParam int meetingId){
        List<CommentEntity> findCommentByMeetingId = commentService.findByMeetingId(meetingId);
        return ResponseObjectFactory.toResult(findCommentByMeetingId, HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommentEntity> updateComment(@RequestParam String text, @RequestParam int id){
        commentService.updateComment(text,id);
        return ResponseObjectFactory.toResult("Update Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommentEntity> insertComment(@RequestBody CommentEntity commentEntity){
        commentService.insertComment(commentEntity);
        return ResponseObjectFactory.toResult("Insert Successfully", HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity<CommentEntity> deleteComment(@RequestParam int id){
        commentService.deleteComment(id);
        return ResponseObjectFactory.toResult("Delete Successfully", HttpStatus.OK);
    }
}
