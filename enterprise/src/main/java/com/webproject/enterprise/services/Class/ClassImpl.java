package com.webproject.enterprise.services.Class;

import com.webproject.enterprise.entity.ClassEntity;
import com.webproject.enterprise.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassImpl implements IClass {

    @Autowired
    private ClassRepository classRepository;

    @Override
    public List<ClassEntity> findAllClass() {
        List<ClassEntity> findAllClass = classRepository.findAll();
        return findAllClass;
    }

    @Override
    public ClassEntity findById(int id) {
        ClassEntity findById = classRepository.findById(id);
        return findById;
    }

    @Override
    public List<ClassEntity> findByTitle(String title){
        List<ClassEntity> findByTitle = classRepository.findByTitle(title);
        return findByTitle;
    }

    @Override
    public ClassEntity insertClass(ClassEntity classEntity) {
        return classRepository.insertClass(classEntity);
    }

    @Override
    public ClassEntity updateClass(String title, String description, String updatedAt, int id) {
        return classRepository.updateClass(title,description,updatedAt,id);
    }
}
