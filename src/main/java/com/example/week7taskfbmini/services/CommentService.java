package com.example.week7taskfbmini.services;

import com.example.week7taskfbmini.entities.Comment;

public interface CommentService {
    Comment createComment(Comment comment);

    Comment getComment(Long id);

    void updateComment(Comment updateComment);

    void deleteComment(Long id);

}
