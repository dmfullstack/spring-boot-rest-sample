package com.learn.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.model.Comment;
import com.learn.model.Greeting;
import com.learn.repository.CommentRepository;
import com.learn.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

    public Greeting greeting() {

        final Greeting greeting = new Greeting();
        greeting.setMessage("greeting");
        return greeting;
    }

    @Autowired
    private CommentRepository commentRepository;

    public Comment createComment(Comment comment) {

        comment.setId(UUID.randomUUID().toString());
        comment.setDeleted(false);
        return commentRepository.save(comment);
    }

    public List<Comment> listComments(String type) {

        return commentRepository.findByTypeAndDeleted(type, false);
    }

    public Comment updateComment(Comment comment) {

        // final Comment existingComment =
        // commentRepository.findOne(comment.getId());

        /*
         * if (existingComment == null) { throw }
         */

        return commentRepository.save(comment);
    }

    public Comment retrieveComment(String commentId) {
        
        return commentRepository.findOne(commentId);
    }

    public void deleteComment(String commentId) {
        
        final Comment existingComment = commentRepository.findOne(commentId);
        existingComment.setDeleted(true);
        
        commentRepository.save(existingComment);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
