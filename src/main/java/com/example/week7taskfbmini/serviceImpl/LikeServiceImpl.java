package com.example.week7taskfbmini.serviceImpl;

import com.example.week7taskfbmini.entities.Comment;
import com.example.week7taskfbmini.entities.Like;
import com.example.week7taskfbmini.entities.Post;
import com.example.week7taskfbmini.entities.User;
import com.example.week7taskfbmini.repositories.LikeRepository;
import com.example.week7taskfbmini.services.LikeService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LikeServiceImpl implements LikeService {

    private final LikeRepository likeRepository;

    public LikeServiceImpl(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    @Override
    public void addLike(Like like) {
        likeRepository.save(like);
    }

    @Override
    public void removeLike(Long id) {
        likeRepository.deleteById(id);
    }

    @Override
    public Optional<Like> getPostLikeByUser(Post post, User user) {
        return likeRepository.findByPostsAndUsers(post, user);
    }

    @Override
    public Optional<Like> getCommentLikeByUser(Comment comment, User user) {
        return likeRepository.findByCommentsAndUsers(comment, user);
    }
}
