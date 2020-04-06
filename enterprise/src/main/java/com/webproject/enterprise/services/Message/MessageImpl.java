package com.webproject.enterprise.services.Message;

import com.webproject.enterprise.entity.MessageEntity;
import com.webproject.enterprise.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageImpl implements IMessage {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<MessageEntity> findAllMessage() {
        List<MessageEntity> listMessage = messageRepository.findAll();
        return listMessage;
    }

    @Override
    public MessageEntity findById(int id) {
        MessageEntity findById = messageRepository.findById(id);
        return findById;
    }

    @Override
    public List<MessageEntity> findByText(String text) {
        List<MessageEntity> findByText = messageRepository.findByText(text);
        return findByText;
    }

    @Override
    public List<MessageEntity> findByUserId(int userId) {
        List<MessageEntity> findByUserId = messageRepository.findByUserId(userId);
        return findByUserId;
    }

    @Override
    public List<MessageEntity> findByRoomId(int roomId) {
        List<MessageEntity> findByRoomId = messageRepository.findByRoomId(roomId);
        return findByRoomId;
    }

    @Override
    public MessageEntity insertMessage(MessageEntity messageEntity) {
        return messageRepository.insertMessage(messageEntity);
    }

    @Override
    public MessageEntity updateMessage(String text, int id) {
        return messageRepository.updateMessage(text, id);
    }

    @Override
    public void deleteMessage(int id) {
        messageRepository.deleteMessage(id);
    }
}
