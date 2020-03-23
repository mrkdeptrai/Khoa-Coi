package services.Permission;

import entity.PermissionEntity;
import model.PermissionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPermission {

    List<PermissionEntity> findAllPermission();

    PermissionEntity findById(int id);

    PermissionEntity findByTitle(String title);

    PermissionDTO insertPermission(PermissionDTO permissionDTO);

    PermissionDTO updatePermission (String title, String updatedAt, int id);
}
