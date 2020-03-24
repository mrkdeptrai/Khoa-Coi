package com.webproject.enterprise.services.Post;

import com.webproject.enterprise.entity.PostEntity;
import com.webproject.enterprise.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostImpl implements IPost{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<PostEntity> findAllPost() {
        List<PostEntity> listPost = postRepository.findAll();
        return listPost;
    }

    @Override
    public PostEntity findById(int id) {
        PostEntity findById = postRepository.findById(id);
        return findById;
    }

    @Override
    public List<PostEntity> findByTitle(String title) {
        List<PostEntity> findByTitle = postRepository.findByTitle(title);
        return findByTitle;
    }

    @Override
    public List<PostEntity> findUserPost(int userID) {
        List<PostEntity> findUserPost = postRepository.findUserPost(userID);
        return findUserPost;
    }

    @Override
    public List<PostEntity> findByClass(int classID) {
        List<PostEntity> findByClass = postRepository.findByClass(classID);
        return findByClass;
    }

    @Override
    public PostEntity insertPost(PostEntity postEntity) {
        return postRepository.insertPost(postEntity);
    }

    @Override
    public PostEntity updatePost(String title, String updatedAt, int id) {
        return postRepository.updatePost(title,updatedAt,id);
    }
}
