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

@RestController
@RequestMapping("/comment")
public class CommentResources {

    @Autowired
    private IComment commentService;

    @GetMapping()
    public ResponseEntity<List<CommentEntity>> findAllComment(){
        List<CommentEntity> listComment = commentService.findAllComment();
        return ResponseObjectFactory.toResult(listComment, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CommentEntity> findCommentById(@PathVariable("id") int id){
        CommentEntity findCommentById = commentService.findById(id);
        return ResponseObjectFactory.toResult(findCommentById, HttpStatus.OK);
    }

    @GetMapping(value = "/{title}")
    public ResponseEntity<List<CommentEntity>> findCommentByBody(@PathVariable("title") String title){
        List<CommentEntity> findCommentByBody = commentService.findByTitle(title);
        return ResponseObjectFactory.toResult(findCommentByBody, HttpStatus.OK);
    }

    @GetMapping(value = "/{userID}")
    public ResponseEntity<List<CommentEntity>> findCommentByUserId(@PathVariable("userID") int userID){
        List<CommentEntity> findCommentByUserId = commentService.findUserComment(userID);
        return ResponseObjectFactory.toResult(findCommentByUserId, HttpStatus.OK);
    }

    @GetMapping(value = "/{postID}")
    public ResponseEntity<List<CommentEntity>> findCommentByPostId(@PathVariable("postID") int postID){
        List<CommentEntity> findCommentByPostId = commentService.findByPost(postID);
        return ResponseObjectFactory.toResult(findCommentByPostId, HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommentEntity> updateComment(@RequestParam String title, @RequestParam String updatedAt, @RequestParam int id){
        commentService.updateComment(title,updatedAt,id);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommentEntity> insertComment(@RequestBody CommentEntity commentEntity){
        commentService.insertComment(commentEntity);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }
}
