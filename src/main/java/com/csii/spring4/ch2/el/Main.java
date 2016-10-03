package com.csii.spring4.ch2.el;/**
 * Created by user on 16/10/3.
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main test
 *
 * @author user
 * @create 2016 -10-03 下午11:43
 */

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ResourceConfig.class);

        ELConfig resourceService=context.getBean(ELConfig.class);

        resourceService.outputResource();

        context.close();

    }
}
