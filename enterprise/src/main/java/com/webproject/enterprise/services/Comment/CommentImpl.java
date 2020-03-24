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
    public List<CommentEntity> findByTitle(String title) {
        List<CommentEntity> findByTitle = commentRepository.findByTitle(title);
        return findByTitle;
    }

    @Override
    public List<CommentEntity> findUserComment(int userID) {
        List<CommentEntity> findUserComment = commentRepository.findUserComment(userID);
        return findUserComment;
    }

    @Override
    public List<CommentEntity> findByPost(int postID) {
        List<CommentEntity> findByPost = commentRepository.findByPost(postID);
        return findByPost;
    }

    @Override
    public CommentEntity insertComment(CommentEntity commentEntity) {
        return commentRepository.insertComment(commentEntity);
    }

    @Override
    public CommentEntity updateComment(String title, String updatedAt, int id) {
        return commentRepository.updateComment(title,updatedAt,id);
    }
}
