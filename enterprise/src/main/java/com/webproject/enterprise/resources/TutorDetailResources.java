package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.TutorDetailEntity;
import com.webproject.enterprise.services.TutorDetail.ITutorDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutordetail")
public class TutorDetailResources {

    @Autowired
    private ITutorDetail tutorDetailService;

    @GetMapping()
    public ResponseEntity<List<TutorDetailEntity>> findAllTutorDetail(){
        List<TutorDetailEntity> listTutorDetail = tutorDetailService.findAllTutorDetail();
        return ResponseObjectFactory.toResult(listTutorDetail, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<TutorDetailEntity> findTutorDetailById(@PathVariable("id") int id){
        TutorDetailEntity findTutorDetailById = tutorDetailService.findById(id);
        return ResponseObjectFactory.toResult(findTutorDetailById, HttpStatus.OK);
    }

    @GetMapping(value = "/{tutorID}")
    public ResponseEntity<List<TutorDetailEntity>> findByTutorID(@PathVariable("tutorID") int tutorID){
        List<TutorDetailEntity> findByTutorID = tutorDetailService.findByTutorID(tutorID);
        return ResponseObjectFactory.toResult(findByTutorID, HttpStatus.OK);
    }

    @GetMapping(value = "/{classID}")
    public ResponseEntity<List<TutorDetailEntity>> findByClass(@PathVariable("classID") int classID){
        List<TutorDetailEntity> findByClass = tutorDetailService.findByClass(classID);
        return ResponseObjectFactory.toResult(findByClass, HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TutorDetailEntity> updateTutorDetail(@RequestParam int classID, @RequestParam String updatedAt, @RequestParam int id){
        tutorDetailService.updateTutorDetail(classID,updatedAt,id);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TutorDetailEntity> insertTutorDetail(@RequestBody TutorDetailEntity tutorDetailEntity){
        tutorDetailService.insertTutorDetail(tutorDetailEntity);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }
}
