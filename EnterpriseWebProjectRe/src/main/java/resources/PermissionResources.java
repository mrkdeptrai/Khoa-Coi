package resources;

import entity.PermissionEntity;
import model.PermissionDTO;
import model.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.Permission.IPermission;

import java.util.List;

@RestController
@RequestMapping("/permission")
public class PermissionResources {

    @Autowired
    private IPermission permissionService;

    @GetMapping()
    public ResponseEntity<List<PermissionEntity>> findAllPermission(){
        List<PermissionEntity> listPermission = permissionService.findAllPermission();
        return ResponseObjectFactory.toResult(listPermission, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PermissionEntity> findPermissionById(@PathVariable("id") int id){
        PermissionEntity findPermissionById = permissionService.findById(id);
        return ResponseObjectFactory.toResult(findPermissionById, HttpStatus.OK);
    }

    @GetMapping(value = "/{title}")
    public ResponseEntity<PermissionEntity> findPermissionById(@PathVariable("title") String title){
        PermissionEntity findPermissionByTitle = permissionService.findByTitle(title);
        return ResponseObjectFactory.toResult(findPermissionByTitle, HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PermissionEntity> updatePermission(@RequestParam String title, @RequestParam String updatedAt, @RequestParam int id ){
        permissionService.updatePermission(title,updatedAt,id);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PermissionEntity> insertPermission(@RequestBody PermissionDTO permissionDTO ){
        permissionService.insertPermission(permissionDTO);
        return ResponseObjectFactory.toResult("Successfully", HttpStatus.OK);
    }


}
