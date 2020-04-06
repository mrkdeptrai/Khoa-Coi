package com.webproject.enterprise.services.Meeting;

import com.webproject.enterprise.entity.MeetingEntity;
import com.webproject.enterprise.entity.RoomEntity;
import com.webproject.enterprise.repository.MeetingRepository;
import com.webproject.enterprise.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingImpl implements IMeeting {

    @Autowired
    private MeetingRepository meetingRepository;

    @Override
    public List<MeetingEntity> findAllMeeting() {
        List<MeetingEntity> findAllMeeting = meetingRepository.findAll();
        return findAllMeeting;
    }

    @Override
    public MeetingEntity findById(int id) {
        MeetingEntity findById = meetingRepository.findById(id);
        return findById;
    }

    @Override
    public List<MeetingEntity> findByTitle(String title){
        List<MeetingEntity> findByTitle = meetingRepository.findByTitle(title);
        return findByTitle;
    }

    @Override
    public List<MeetingEntity> findByRoomId(int roomId) {
        List<MeetingEntity> findByRoomId = meetingRepository.findByRoomId(roomId);
        return findByRoomId;
    }

    @Override
    public MeetingEntity insertMeeting(MeetingEntity meetingEntity) {
        return meetingRepository.insertMeeting(meetingEntity);
    }

    @Override
    public MeetingEntity updateMeeting(String title, String body, String dateAt, int id) {
        return meetingRepository.updateMeeting(title, body, dateAt, id);
    }

    @Override
    public void deleteMeeting(int id) {
        meetingRepository.deleteMeeting(id);
    }

}
