package com.learn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Comment;
import com.learn.model.Greeting;
import com.learn.service.CommentService;

@RestController
public class CommentController {

    private static final Logger logger = LoggerFactory.getLogger(CommentController.class);

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting() {

        logger.info("Greeting method");

        return commentService.greeting();
    }

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/comments", method = RequestMethod.POST, consumes = "application/json")
    public Comment createComment(@Validated @RequestBody Comment comment) {

        return commentService.createComment(comment);
    }

    @RequestMapping(value = "/comments", method = RequestMethod.GET, produces = "application/json")
    public List<Comment> listComments(@RequestParam("type") String type) {

        return commentService.listComments(type);
    }

    @RequestMapping(value = "/comments/{commentId}", method = RequestMethod.PUT)
    public Comment updateComment(@PathVariable("commentId") String commentId, @RequestBody Comment comment) {

        // Validate the comment.commentId and commentId from path

        return commentService.updateComment(comment);
    }

    @RequestMapping(value = "/comments/{commentId}", method = RequestMethod.GET)
    public Comment retrieveComment(@PathVariable("commentId") String commentId) {

        return commentService.retrieveComment(commentId);
    }

    @RequestMapping(value = "/comments/{commentId}", 
            method = RequestMethod.DELETE)
    public void deleteComment(@PathVariable("commentId") String commentId) {

        commentService.deleteComment(commentId);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
