package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.PostEntity;
import com.webproject.enterprise.services.Post.IPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostResources {

    @Autowired
    private IPost postService;

    @GetMapping()
    public ResponseEntity<List<PostEntity>> findAllPost(){
        List<PostEntity> listPost = postService.findAllPost();
        return ResponseObjectFactory.toResult(listPost, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PostEntity> findPostById(@PathVariable("id") int id){
        PostEntity findPostById = postService.findById(id);
        return ResponseObjectFactory.toResult(findPostById, HttpStatus.OK);
    }

    @GetMapping(value = "/{title}")
    public ResponseEntity<List<PostEntity>> findPostByContent(@PathVariable("title") String title){
        List<PostEntity> findPostByContent = postService.findByTitle(title);
        return ResponseObjectFactory.toResult(findPostByContent, HttpStatus.OK);
    }

    @GetMapping(value = "/{userID}")
    public ResponseEntity<List<PostEntity>> findPostByUserId(@PathVariable("userID") int userID){
        List<PostEntity> findPostByUserId = postService.findUserPost(userID);
        return ResponseObjectFactory.toResult(findPostByUserId, HttpStatus.OK);
    }

    @GetMapping(value = "/{classID}")
    public ResponseEntity<List<PostEntity>> findPostByClassId(@PathVariable("classID") int classID){
        List<PostEntity> findPostByClassId = postService.findByClass(classID);
        return ResponseObjectFactory.toResult(findPostByClassId, HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PostEntity> updatePost(@RequestParam String title, @RequestParam String updatedAt, @RequestParam int id){
        postService.updatePost(title,updatedAt,id);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PostEntity> insertComment(@RequestBody PostEntity postEntity){
        postService.insertPost(postEntity);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }
}
