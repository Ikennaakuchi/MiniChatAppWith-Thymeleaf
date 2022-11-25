package com.example.week7taskfbmini.services;

import com.example.week7taskfbmini.entities.Comment;
import com.example.week7taskfbmini.entities.Like;
import com.example.week7taskfbmini.entities.Post;
import com.example.week7taskfbmini.entities.User;

import java.util.Optional;

public interface LikeService {
    void addLike(Like like);
    void removeLike(Long id);

    Optional<Like> getPostLikeByUser(Post post, User user);
    Optional<Like> getCommentLikeByUser(Comment comment, User user);
}
