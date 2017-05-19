package com.learn.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.learn.model.Comment;

public interface CommentRepository 
    extends MongoRepository<Comment, String>{

    List<Comment> findByTypeAndDeleted(String type, boolean deleted);
}
