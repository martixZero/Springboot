package com.csii.spring4.ch1.aop;

/**
 * Created by user on 16/10/3.
 */
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 编写切面
 *
 * @author user
 * @create 2016 -10-03 下午9:20
 */
@Aspect
@Component
public class LogAspect {

    //切点
    @Pointcut("@annotation(com.csii.spring4.ch1.aop.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")//一个建言  pointcut声明的切点
    public void after(JoinPoint joinPoint){
        MethodSignature signature= (MethodSignature) joinPoint.getSignature();

        Method method=signature.getMethod();

        Action action=method.getAnnotation(Action.class);
        System.out.println("注解式拦截： "+action.name());

    }


    //直接使用拦截规则作为参数
    @Before("execution(* com.csii.spring4.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){

        MethodSignature signature= (MethodSignature) joinPoint.getSignature();

        Method method=signature.getMethod();

        System.out.println("方法规则式拦截： "+method.getName());
    }
}
