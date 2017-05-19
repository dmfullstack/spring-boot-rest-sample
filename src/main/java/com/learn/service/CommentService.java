package com.learn.service;

import java.util.List;

import com.learn.model.Comment;
import com.learn.model.Greeting;

public interface CommentService {

    Greeting greeting();

    Comment createComment(Comment comment);
    
    List<Comment> listComments(String type);
    
    Comment updateComment(Comment comment);
    
    Comment retrieveComment(String commentId);
    
    void deleteComment(String commentId);
}
