package com.webproject.enterprise.resources;

import com.webproject.enterprise.ResponseOb.ResponseObjectFactory;
import com.webproject.enterprise.entity.FileUploadEntity;
import com.webproject.enterprise.services.FileUpload.IFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/FileUpload")
public class FileUploadResources {

    @Autowired
    private IFileUpload fileUploadService;

    @GetMapping
    public ResponseEntity<List<FileUploadEntity>> findAllFileUpload(){
        List<FileUploadEntity> listFile = fileUploadService.findAllFileUpload();
        return ResponseObjectFactory.toResult(listFile, HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<FileUploadEntity> findFileById(@RequestParam int id){
        FileUploadEntity findFileById = fileUploadService.findById(id);
        return ResponseObjectFactory.toResult(findFileById,HttpStatus.OK);
    }

    @GetMapping("/fileName")
    public ResponseEntity<List<FileUploadEntity>> findFileByName(@RequestParam String name){
        List<FileUploadEntity> findFileByName = fileUploadService.findByFileName(name);
        return ResponseObjectFactory.toResult(findFileByName,HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FileUploadEntity> updateFileUpload(@RequestParam String fileName, @RequestParam int id){
        fileUploadService.updateFile(fileName,id);
        return ResponseObjectFactory.toResult("Update Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FileUploadEntity> insertFileUpload(@RequestBody FileUploadEntity fileUploadEntity){
        fileUploadService.insertFile(fileUploadEntity);
        return ResponseObjectFactory.toResult("Insert Successfully", HttpStatus.OK);
    }
}
