package com.csii.spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by user on 16/10/2.
 */
public class Main {


    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("di"));

        context.close();
    }
}
