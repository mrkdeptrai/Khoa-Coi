package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.ClassEntity;
import com.webproject.enterprise.services.Class.IClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassResources {

    @Autowired
    private IClass classService;

    @GetMapping()
    public ResponseEntity<List<ClassEntity>> findAllClass(){
        List<ClassEntity> listClass = classService.findAllClass();
        return ResponseObjectFactory.toResult(listClass, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClassEntity> findClassById(@PathVariable("id") int id){
        ClassEntity findClassById = classService.findById(id);
        return ResponseObjectFactory.toResult(findClassById, HttpStatus.OK);
    }

    @GetMapping(value = "/{title}")
    public ResponseEntity<List<ClassEntity>> findClassByName(@PathVariable("title") String title){
        List<ClassEntity> findClassByName = classService.findByTitle(title);
        return ResponseObjectFactory.toResult(findClassByName, HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClassEntity> updateClass(@RequestParam String title, @RequestParam String description, @RequestParam String updatedAt, @RequestParam int id){
        classService.updateClass(title,description,updatedAt,id);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClassEntity> insertClass(@RequestBody ClassEntity classEntity){
        classService.insertClass(classEntity);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }


}
