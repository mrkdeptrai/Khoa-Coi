package com.webproject.enterprise.services.Permission;


import com.webproject.enterprise.entity.PermissionEntity;

import java.util.List;

public interface IPermission {

    List<PermissionEntity> findAllPermission();

    PermissionEntity findById(int id);

    PermissionEntity findByTitle(String title);

    PermissionEntity insertPermission(PermissionEntity permissionEntity);

    PermissionEntity updatePermission(String title, String updatedAt, int id);
}
