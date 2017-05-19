package com.learn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.learn.model.Greeting;
import com.learn.service.CommentService;

/**
 * Unit test for controller.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class CommentControllerTest {

    @Autowired
    private CommentService commentService;

    @Test
    public void testGreeting() throws Exception {

        final Greeting greeting = commentService.greeting();
        assertEquals("greeting", greeting.getMessage());
    }
}
