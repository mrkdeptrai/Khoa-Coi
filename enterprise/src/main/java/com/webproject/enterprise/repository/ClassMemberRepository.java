package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.ClassMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassMemberRepository extends JpaRepository<ClassMemberEntity,Integer> {
    @Query(value = "SELECT * FROM tblClassMember WHERE id = ?1", nativeQuery = true)
    ClassMemberEntity findById(int id);

    @Query(value = "SELECT * FROM tblClassMember WHERE classID = ?1", nativeQuery = true)
    List<ClassMemberEntity> findAllStudentInClass(int classID);

    @Query(value = "SELECT * FROM tblClassMember WHERE studentID = ?1", nativeQuery = true)
    List<ClassMemberEntity> findClassesOfStudent(int studentID);

    @Query (value = "INSERT INTO tblClassMember (userID,classID,createdAt,updatedAt) values = ?1, ?2, ?3, ?4", nativeQuery = true)
    ClassMemberEntity insertClassMember(ClassMemberEntity classMemberEntity);

    @Query (value = "UPDATE tblClassMember SET classID = ?1, updatedAt = ?2 WHERE id = ?3", nativeQuery = true)
    ClassMemberEntity updateClassMember(int classID, String updatedAt, int id);
}
