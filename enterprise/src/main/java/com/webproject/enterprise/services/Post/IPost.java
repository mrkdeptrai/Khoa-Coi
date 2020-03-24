package com.webproject.enterprise.services.Post;

import com.webproject.enterprise.entity.PostEntity;

import java.util.List;

public interface IPost {

    List<PostEntity> findAllPost();

    PostEntity findById(int id);

    List<PostEntity> findByTitle(String title);

    List<PostEntity> findUserPost(int userID);

    List<PostEntity> findByClass(int classID);

    PostEntity insertPost(PostEntity postEntity);

    PostEntity updatePost(String title, String updatedAt, int id);
}
