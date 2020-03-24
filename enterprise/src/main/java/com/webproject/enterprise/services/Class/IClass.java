package com.webproject.enterprise.services.Class;

import com.webproject.enterprise.entity.ClassEntity;

import java.util.List;

public interface IClass {
    List<ClassEntity> findAllClass();

    ClassEntity findById(int id);

    List<ClassEntity> findByTitle(String title);

    ClassEntity insertClass(ClassEntity classEntity);

    ClassEntity updateClass(String title, String description, String updatedAt, int id);
}
