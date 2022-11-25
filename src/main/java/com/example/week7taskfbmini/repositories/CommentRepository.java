package com.example.week7taskfbmini.repositories;

import com.example.week7taskfbmini.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
