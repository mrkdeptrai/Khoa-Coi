package resources;

import entity.UserEntity;
import model.UserDTO;
import model.response.ResponseObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.User.IUser;

import java.util.List;

@RestController
public class UserResources {

    @Autowired
    private IUser userService;

    @GetMapping("/user")
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
    public ResponseEntity<UserEntity> findUserByName(@PathVariable("name") String name){
        UserEntity findUserByName = userService.findByName(name);
        return ResponseObjectFactory.toResult(findUserByName, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<UserEntity>> findAllTutor(){
        List<UserEntity> listTutor = userService.findAllTutor();
        return ResponseObjectFactory.toResult(listTutor, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<UserEntity>> findAllStudent(){
        List<UserEntity> listStudent = userService.findAllStudent();
        return ResponseObjectFactory.toResult(listStudent, HttpStatus.OK);
    }

//    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<Object[]>> checkLogin(@RequestParam String email, @RequestParam String password){
//        userService.checkLogin(email,password);
//        return ResponseObjectFactory.toResult(list, HttpStatus.OK);
//    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserEntity> updatePermission(@RequestParam String password, @RequestParam String name, @RequestParam String dob, @RequestParam String gender, @RequestParam int phone, @RequestParam String address, @RequestParam String avatar, @RequestParam String updatedAt, @RequestParam int id){
        userService.updateUser(password,name,dob,gender,phone,address,avatar,updatedAt,id);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserEntity> insertPermission(@RequestBody UserDTO userDTO){
        userService.insertUser(userDTO);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }
}
