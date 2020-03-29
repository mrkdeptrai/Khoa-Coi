package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.UserEntity;
import com.webproject.enterprise.services.User.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResources {

    @Autowired
    private IUser userService;

    @GetMapping()
    public ResponseEntity<List<UserEntity>> findAllUser(){
        List<UserEntity> listUser = userService.findAllUser();
        return ResponseObjectFactory.toResult(listUser, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserEntity> findUserById(@PathVariable("id") int id){
        UserEntity findUserById = userService.findById(id);
        return ResponseObjectFactory.toResult(findUserById, HttpStatus.OK);
    }

    @GetMapping(value = "/{email}")
    public ResponseEntity<UserEntity> findUserByEmail(@PathVariable("email") String email){
        UserEntity findUserByEmail = userService.findByEmail(email);
        return ResponseObjectFactory.toResult(findUserByEmail, HttpStatus.OK);
    }

    @GetMapping(value = "/{name}")
    public ResponseEntity<List<UserEntity>> findUserByName(@PathVariable("name") String name){
        List<UserEntity> findUserByName = userService.findByName(name);
        return ResponseObjectFactory.toResult(findUserByName, HttpStatus.OK);
    }

    @GetMapping("/tutor")
    public ResponseEntity<List<UserEntity>> findAllTutor(){
        List<UserEntity> listTutor = userService.findAllTutor();
        return ResponseObjectFactory.toResult(listTutor, HttpStatus.OK);
    }

    @GetMapping("/student")
    public ResponseEntity<List<UserEntity>> findAllStudent(){
        List<UserEntity> listStudent = userService.findAllStudent();
        return ResponseObjectFactory.toResult(listStudent, HttpStatus.OK);
    }

    @GetMapping("/login")
    public ResponseEntity<Integer> checkLogin(@RequestParam String email, @RequestParam String password){
        userService.checkLogin(email,password);
        return ResponseObjectFactory.toResult(checkLogin(email,password), HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserEntity> updatePermission(@RequestParam String password, @RequestParam String name, @RequestParam String dob,
                                                       @RequestParam String gender, @RequestParam int phone, @RequestParam String address,
                                                       @RequestParam String avatar, @RequestParam int role, @RequestParam int status, @RequestParam String updatedAt, @RequestParam int id){
//        @RequestBody UserEntity userEntityObject
//                UserEntity usser = userServce.update(userEntityObject)
//        userService.update(userEntityObject)
        userService.updateUser(password,name,dob,gender,phone,address,avatar,role,status,updatedAt,id);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserEntity> insertPermission(@RequestBody UserEntity userEntity){
        userService.insertUser(userEntity);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }
}
