package com.webproject.enterprise.services.Message;

import com.webproject.enterprise.entity.MeetingEntity;
import com.webproject.enterprise.entity.MessageEntity;

import java.util.List;

public interface IMessage {

    List<MessageEntity> findAllMessage();

    MessageEntity findById(int id);

    List<MessageEntity> findByText(String text);

    List<MessageEntity> findByUserId(int userId);

    List<MessageEntity> findByRoomId(int roomId);

    MessageEntity insertMessage(MessageEntity messageEntity);

    MessageEntity updateMessage(String text, int id);

    void deleteMessage(int id);
}
