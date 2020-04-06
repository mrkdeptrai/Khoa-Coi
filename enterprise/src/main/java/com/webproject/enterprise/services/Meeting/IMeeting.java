package com.webproject.enterprise.services.Meeting;

import com.webproject.enterprise.entity.MeetingEntity;
import com.webproject.enterprise.entity.RoomEntity;

import java.util.List;

public interface IMeeting {
    List<MeetingEntity> findAllMeeting();

    MeetingEntity findById(int id);

    List<MeetingEntity> findByTitle(String title);

    List<MeetingEntity> findByRoomId(int roomId);

    MeetingEntity insertMeeting(MeetingEntity meetingEntity);

    MeetingEntity updateMeeting(String title, String body, String dateAt, int id);

    void deleteMeeting(int id);
}
