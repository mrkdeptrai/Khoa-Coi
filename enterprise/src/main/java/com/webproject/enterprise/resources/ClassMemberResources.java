package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.ClassMemberEntity;
import com.webproject.enterprise.services.ClassMember.IClassMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ClassMember")
public class ClassMemberResources {

    @Autowired
    private IClassMember classMemberService;

    @GetMapping()
    public ResponseEntity<List<ClassMemberEntity>> findAllClassMember(){
        List<ClassMemberEntity> listClassMember = classMemberService.findAllClassMember();
        return ResponseObjectFactory.toResult(listClassMember, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClassMemberEntity> findClassMemberById(@PathVariable("id") int id){
        ClassMemberEntity findClassMemberById = classMemberService.findById(id);
        return ResponseObjectFactory.toResult(findClassMemberById, HttpStatus.OK);
    }

    @GetMapping(value = "/{classID}")
    public ResponseEntity<List<ClassMemberEntity>> findAllStudentInClass(@PathVariable("classID") int classID){
        List<ClassMemberEntity> findAllStudentInClass = classMemberService.findAllStudentInClass(classID);
        return ResponseObjectFactory.toResult(findAllStudentInClass, HttpStatus.OK);
    }

    @GetMapping(value = "/{studentID}")
    public ResponseEntity<List<ClassMemberEntity>> findClassesOfStudent(@PathVariable("studentID") int studentID){
        List<ClassMemberEntity> findClassesOfStudent = classMemberService.findClassesOfStudent(studentID);
        return ResponseObjectFactory.toResult(findClassesOfStudent, HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClassMemberEntity> updateClassMember(@RequestParam int classID, @RequestParam String updatedAt, @RequestParam int id){
        classMemberService.updateClassMember(classID,updatedAt,id);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClassMemberEntity> insertClassMember(@RequestBody ClassMemberEntity classMemberEntity){
        classMemberService.insertClassMember(classMemberEntity);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }
}
