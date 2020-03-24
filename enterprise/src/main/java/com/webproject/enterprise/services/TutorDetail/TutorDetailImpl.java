package com.webproject.enterprise.services.TutorDetail;

import com.webproject.enterprise.entity.TutorDetailEntity;
import com.webproject.enterprise.repository.TutorDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorDetailImpl implements ITutorDetail{

    @Autowired
    private TutorDetailRepository tutorDetailRepository;

    @Override
    public List<TutorDetailEntity> findAllTutorDetail() {
        List<TutorDetailEntity> listTutorDetail = tutorDetailRepository.findAll();
        return listTutorDetail;
    }

    @Override
    public TutorDetailEntity findById(int id) {
        TutorDetailEntity findById = tutorDetailRepository.findById(id);
        return findById;
    }

    @Override
    public List<TutorDetailEntity> findByTutorID(int tutorID) {
        List<TutorDetailEntity> findByTutorId = tutorDetailRepository.findByTutorID(tutorID);
        return findByTutorId;
    }

    @Override
    public List<TutorDetailEntity> findByClass(int classID) {
        List<TutorDetailEntity> findByClassId = tutorDetailRepository.findByClass(classID);
        return findByClassId;
    }

    @Override
    public TutorDetailEntity insertTutorDetail(TutorDetailEntity tutorDetailEntity) {
        return tutorDetailRepository.insertTutorDetail(tutorDetailEntity);
    }

    @Override
    public TutorDetailEntity updateTutorDetail(int classID, String updatedAt, int id) {
        return tutorDetailRepository.updateTutorDetail(classID,updatedAt,id);
    }
}
