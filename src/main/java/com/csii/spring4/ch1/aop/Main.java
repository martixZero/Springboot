package com.csii.spring4.ch1.aop;/**
 * Created by user on 16/10/3.
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试主函数
 *
 * @author user
 * @create 2016 -10-03 下午10:06
 */

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService=context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService=context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context.close();

    }
}
