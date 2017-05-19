package com.learn.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceAdvice.class);

    @Before("execution(* com.learn.service.CommentService.greeting())")
    public void beforeGreeting() {
        LOGGER.info("Before Execution -> Greeting");
    }

    @After("execution(* com.learn.service.*.*(..))")
    public void afterAnyMethod() {
        LOGGER.info("After any method");
    }
}