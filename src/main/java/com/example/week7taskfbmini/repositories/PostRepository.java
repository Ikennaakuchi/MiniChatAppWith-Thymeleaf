package com.example.week7taskfbmini.repositories;

import com.example.week7taskfbmini.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
