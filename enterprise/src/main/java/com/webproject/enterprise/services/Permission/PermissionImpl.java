package com.webproject.enterprise.services.Permission;

import com.webproject.enterprise.entity.PermissionEntity;
import com.webproject.enterprise.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public PermissionEntity insertPermission(PermissionEntity permissionEntity) {
        return permissionRepository.insertPermission(permissionEntity);
    }

    @Override
    public PermissionEntity updatePermission(String title, String updatedAt, int id) {
        return permissionRepository.updatePermission(title,updatedAt,id);
    }
}
