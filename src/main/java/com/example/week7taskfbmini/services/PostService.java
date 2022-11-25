package com.example.week7taskfbmini.services;

import com.example.week7taskfbmini.entities.Post;

import java.util.List;

public interface PostService {
    Post createPost(Post post);

    List<Post> getAllPosts();

    Post getPost(Long id);

    void updatePost(Post updatePost);

    void deletePost(Long id);
}
