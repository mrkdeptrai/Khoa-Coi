package com.webproject.enterprise.services.Comment;

import com.webproject.enterprise.entity.CommentEntity;
import com.webproject.enterprise.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentImpl implements IComment {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<CommentEntity> findAllComment() {
        List<CommentEntity> findAllComment = commentRepository.findAll();
        return findAllComment;
    }

    @Override
    public CommentEntity findById(int id) {
        CommentEntity findById = commentRepository.findById(id);
        return findById;
    }

    @Override
    public List<CommentEntity> findByText(String text) {
        List<CommentEntity> findByText = commentRepository.findByText(text);
        return findByText;
    }

    @Override
    public List<CommentEntity> findByUserId(int userId) {
        List<CommentEntity> findUserId = commentRepository.findUserId(userId);
        return findUserId;
    }

    @Override
    public List<CommentEntity> findByMeetingId(int meetingId) {
        List<CommentEntity> findByMeetingId = commentRepository.findByMeetingId(meetingId);
        return findByMeetingId;
    }

    @Override
    public CommentEntity insertComment(CommentEntity commentEntity) {
        return commentRepository.insertComment(commentEntity);
    }

    @Override
    public CommentEntity updateComment(String title, int id) {
        return commentRepository.updateComment(title,id);
    }

    @Override
    public void deleteComment(int id) {
        commentRepository.deleteComment(id);
    }
}
