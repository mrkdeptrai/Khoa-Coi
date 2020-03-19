package services.Permission;

import entity.PermissionEntity;
import model.PermissionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PermissionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionImpl implements IPermission{

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<PermissionEntity> findAllPermission() {
        List<PermissionEntity> listPermission= permissionRepository.findAll();
        return listPermission;
    }

    @Override
    public PermissionEntity findById(int id) {
        PermissionEntity findPermissionById = permissionRepository.findById(id);
        return findPermissionById;
    }

    @Override
    public PermissionEntity findByTitle(String title) {
        PermissionEntity findPermissionByTitle = permissionRepository.findByTitle(title);
        return findPermissionByTitle;
    }

    @Override
    public PermissionDTO insertPermission(PermissionDTO permission) {
        return permissionRepository.insertPermission(permission);
    }

    @Override
    public PermissionDTO updatePermission(String title, String updatedAt, int id) {
        return permissionRepository.updatePermission(title,updatedAt,id);
    }
}
