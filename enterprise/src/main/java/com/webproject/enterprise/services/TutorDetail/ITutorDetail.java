package com.webproject.enterprise.services.TutorDetail;

import com.webproject.enterprise.entity.TutorDetailEntity;

import java.util.List;

public interface ITutorDetail {

    List<TutorDetailEntity> findAllTutorDetail();

    TutorDetailEntity findById(int id);

    List<TutorDetailEntity> findByTutorID(int tutorID);

    List<TutorDetailEntity> findByClass(int classID);

    TutorDetailEntity insertTutorDetail(TutorDetailEntity tutorDetailEntity);

    TutorDetailEntity updateTutorDetail(int classID, String updatedAt, int id);
}
