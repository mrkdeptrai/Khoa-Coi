package com.webproject.enterprise.services.Comment;

import com.webproject.enterprise.entity.CommentEntity;

import java.util.List;

public interface IComment {

    List<CommentEntity> findAllComment();

    CommentEntity findById(int id);

    List<CommentEntity> findByText(String text);

    List<CommentEntity> findByUserId(int userId);

    List<CommentEntity> findByMeetingId(int meetingId);

    CommentEntity insertComment(CommentEntity commentEntity);

    CommentEntity updateComment(String text, int id);

    void deleteComment(int id);
}
