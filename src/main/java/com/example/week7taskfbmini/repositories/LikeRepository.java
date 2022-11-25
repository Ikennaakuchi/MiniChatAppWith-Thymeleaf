package com.example.week7taskfbmini.repositories;


import com.example.week7taskfbmini.entities.Comment;
import com.example.week7taskfbmini.entities.Like;
import com.example.week7taskfbmini.entities.Post;
import com.example.week7taskfbmini.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {

    Optional<Like> findByPostsAndUsers(Post posts, User users);
    Optional<Like> findByCommentsAndUsers(Comment comments, User users);
}
