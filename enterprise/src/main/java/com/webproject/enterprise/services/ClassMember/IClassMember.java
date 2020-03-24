package com.webproject.enterprise.services.ClassMember;

import com.webproject.enterprise.entity.ClassMemberEntity;
import com.webproject.enterprise.entity.UserEntity;

import java.util.List;

public interface IClassMember {

    List<ClassMemberEntity> findAllClassMember();

    ClassMemberEntity findById(int id);

    List<ClassMemberEntity> findAllStudentInClass(int classID);

    List<ClassMemberEntity> findClassesOfStudent(int studentID);

    ClassMemberEntity insertClassMember(ClassMemberEntity classMemberEntity);

    ClassMemberEntity updateClassMember(int classID, String updatedAt, int id);
}
