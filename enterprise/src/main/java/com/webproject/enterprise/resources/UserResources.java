package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.UserEntity;
import com.webproject.enterprise.services.User.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/User")
public class UserResources {

    @Autowired
    private IUser userService;

    @GetMapping()
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<UserEntity>> findAllUser(){
        List<UserEntity> listUser = userService.findAllUser();
        return ResponseObjectFactory.toResult(listUser, HttpStatus.OK);
    }

    @GetMapping("/id")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<UserEntity> findUserById(@RequestParam int id){
        UserEntity findUserById = userService.findById(id);
        return ResponseObjectFactory.toResult(findUserById, HttpStatus.OK);
    }

    @GetMapping("/email")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<UserEntity> findUserByEmail(@RequestParam String email){
        UserEntity findUserByEmail = userService.findByEmail(email);
        return ResponseObjectFactory.toResult(findUserByEmail, HttpStatus.OK);
    }

    @GetMapping("/emailSimilar")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<UserEntity> searchEmail(@RequestParam String emailSimilar){
        List<UserEntity> searchEmail = userService.searchEmail(emailSimilar);
        return ResponseObjectFactory.toResult(searchEmail, HttpStatus.OK);
    }

    @GetMapping("/name")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<UserEntity>> findUserByName(@RequestParam String name){
        List<UserEntity> findUserByName = userService.findByName(name);
        return ResponseObjectFactory.toResult(findUserByName, HttpStatus.OK);
    }

    @GetMapping("/tutor")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<UserEntity>> findAllTutor(){
        List<UserEntity> listTutor = userService.findAllTutor();
        return ResponseObjectFactory.toResult(listTutor, HttpStatus.OK);
    }

    @GetMapping("/student")
    @PreAuthorize("hasRole('ADMIN') or hasRole('TUTOR')")
    public ResponseEntity<List<UserEntity>> findAllStudent(){
        List<UserEntity> listStudent = userService.findAllStudent();
        return ResponseObjectFactory.toResult(listStudent, HttpStatus.OK);
    }

//    @GetMapping("/login")
//    public ResponseEntity<Integer> checkLogin(@RequestParam String email, @RequestParam String password){
//        UserEntity user = userService.checkLogin(email,password);
//        return ResponseObjectFactory.toResult(user, HttpStatus.OK);
//    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserEntity> updatePermission(@RequestParam String password, @RequestParam String name,
                                                       @RequestParam String avatar, @RequestParam int id){
//        @RequestBody UserEntity userEntityObject
//                UserEntity usser = userServce.update(userEntityObject)
//        userService.update(userEntityObject)
        userService.updateUser(password,name,avatar,id);
        return ResponseObjectFactory.toResult("Update Successfully", HttpStatus.OK);
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<UserEntity> insertPermission(@RequestBody UserEntity userEntity) throws Exception {
        userService.insertUser(userEntity);
        return ResponseObjectFactory.toResult("Insert Successfully", HttpStatus.OK);
    }
}
