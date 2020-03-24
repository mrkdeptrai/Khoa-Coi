package com.webproject.enterprise.services.Comment;

import com.webproject.enterprise.entity.CommentEntity;

import java.util.List;

public interface IComment {

    List<CommentEntity> findAllComment();

    CommentEntity findById(int id);

    List<CommentEntity> findByTitle(String title);

    List<CommentEntity> findUserComment(int userID);

    List<CommentEntity> findByPost(int postID);

    CommentEntity insertComment(CommentEntity commentEntity);

    CommentEntity updateComment(String title, String updatedAt, int id);
}
