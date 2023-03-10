package com.example.springaop.aop;

import com.example.springaop.entity.Product;
import com.example.springaop.exceptions.ProductExceptioin;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class GeneralAop {

    @Pointcut("this(com.example.springaop.controllers.MyController)")
    public void pointcut(){

    }
//    @Pointcut("@annotation(com.example.springaop.annotations.CustomAnotation)")
//    public void pointcutAnnotation(){
//
//    }
//    @Pointcut("execution(* com.example.springaop.controllers.MyController.getProduct(..))")
//    public void pointcutyExecutionExact(){
//
//    }
//    @After("pointcutyExecutionExact()")
//    public void after(JoinPoint joinPoint){
//        log.info("After " + joinPoint.getSignature());
//    }

//    @After("pointcut()")
//    public void after(JoinPoint joinPoint){
//
//        Product arg = (Product) joinPoint.getArgs()[0];
//        log.info("After " + joinPoint.getSignature() + arg);
//    }


//    @After("pointcut()")
//    public void after(JoinPoint joinPoint){
//        log.info("After " + joinPoint.getSignature());
//    }
//    @Before("pointcut()")
//    public void before(JoinPoint joinPoint){
//        log.info("Before "+joinPoint.getSignature());
//    }
//    @AfterReturning(value = "pointcut()",returning = "product")
//    public void afterReturning(JoinPoint joinPoint, Product product){
//                log.info("After " + joinPoint.getSignature() + " returned "+ product);
//
//    }
//
//    @AfterThrowing(value = "pointcut()",throwing = "productExceptioin")
//    public void afterThrowing(JoinPoint joinPoint, ProductExceptioin productExceptioin){
//        log.info("After " + joinPoint.getSignature() + " returned "+ productExceptioin.getMessage());
//
//    }
//    @Around("pointcut()")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        log.info("Before "+joinPoint.getSignature());
//        Object proceed = joinPoint.proceed();
//        log.info("After "+joinPoint.getSignature());
//        return proceed;
//    }

//    execution(com.example.springaop.entity.Product com.example.springaop.controllers.MyController.getProduct())
//    sada je return type product
//
//    execution(com.example.springaop.entity.*com.example.springaop.controllers.MyController.getProduct())
//            return type su sve klase iz paketa entity
//
//
//    execution(void com.example.springaop.controllers.MyController.getProduct())
//            return type je void
//
//
//    execution(void com.example.springaop.controllers.MyController.get*())
//    metoda pocinje sa get...
}
