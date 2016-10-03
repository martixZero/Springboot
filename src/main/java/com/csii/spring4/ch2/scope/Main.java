package com.csii.spring4.ch2.scope;/**
 * Created by user on 16/10/3.
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main Test
 *
 * @author user
 * @create 2016 -10-03 下午11:01
 */

public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoPrototypeService demoPrototypeService = context.getBean(DemoPrototypeService.class);

        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);

        DemoSingletonService demoSingletonService = context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = context.getBean(DemoSingletonService.class);


        System.out.println("asda");
        System.out.println("s1 is equal with s2:"+demoSingletonService.equals(demoSingletonService2));

        System.out.print("p1 is equals with p2: "+demoPrototypeService.equals(demoPrototypeService2));
    }
}
