package com.webproject.enterprise.services.ClassMember;

import com.webproject.enterprise.entity.ClassMemberEntity;
import com.webproject.enterprise.repository.ClassMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassMemberImpl implements IClassMember {

    @Autowired
    private ClassMemberRepository classMemberRepository;

    @Override
    public List<ClassMemberEntity> findAllClassMember() {
        List<ClassMemberEntity> findAllClassMember = classMemberRepository.findAll();
        return findAllClassMember;
    }

    @Override
    public ClassMemberEntity findById(int id) {
        ClassMemberEntity findById = classMemberRepository.findById(id);
        return findById;
    }

    @Override
    public List<ClassMemberEntity> findAllStudentInClass(int classID) {
        List<ClassMemberEntity> findAllStudentInClass = classMemberRepository.findAllStudentInClass(classID);
        return findAllStudentInClass;
    }

    @Override
    public List<ClassMemberEntity> findClassesOfStudent(int studentID) {
        List<ClassMemberEntity> findClassesOfStudent = classMemberRepository.findClassesOfStudent(studentID);
        return findClassesOfStudent;
    }

    @Override
    public ClassMemberEntity insertClassMember(ClassMemberEntity classMemberEntity) {
        return classMemberRepository.insertClassMember(classMemberEntity);
    }

    @Override
    public ClassMemberEntity updateClassMember(int classID, String updatedAt, int id) {
        return updateClassMember(classID,updatedAt,id);
    }
}
