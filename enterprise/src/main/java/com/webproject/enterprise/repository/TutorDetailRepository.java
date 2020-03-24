package com.webproject.enterprise.repository;

import com.webproject.enterprise.entity.TutorDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorDetailRepository extends JpaRepository<TutorDetailEntity,Integer> {
    @Query(value = "SELECT * FROM tblTutorDetail WHERE id = ?1", nativeQuery = true)
    TutorDetailEntity findById(int id);

    @Query(value = "SELECT * FROM tblTutorDetail WHERE tutorID = ?1", nativeQuery = true)
    List<TutorDetailEntity> findByTutorID(int tutorID);

    @Query(value = "SELECT * FROM tblTutorDetail WHERE classID = ?1", nativeQuery = true)
    List<TutorDetailEntity> findByClass(int classID);

    @Query (value = "INSERT INTO tblTutorDetail (tutorID,startAt,endAt,classID,createdAt,updatedAt) values = ?1, ?2, ?3, ?4,?5,?6", nativeQuery = true)
    TutorDetailEntity insertTutorDetail(TutorDetailEntity tutorDetailEntity);

    @Query (value = "UPDATE tblTutorDetail SET classID = ?1, updatedAt = ?2 WHERE id = ?3", nativeQuery = true)
    TutorDetailEntity updateTutorDetail(int classID, String updatedAt, int id);
}
