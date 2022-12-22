package com.example.springaop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AuthAop {

    @Pointcut("within(com.example.springaop.controllers.MyController)")
    public void authentication(){}

    @Pointcut("within(com.example.springaop.controllers.MyController)")
    public void authorization(){}

    @Before("authentication() && authorization()")
    public void auth(){
        log.info("Do authentication");
        log.info("Do authorization");
    }
}
