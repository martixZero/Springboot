package com.csii.spring4.ch1.aop;/**
 * Created by user on 16/10/3.
 */

import java.lang.annotation.*;

/**
 * @author user
 * @interface
 * @create 2016 -10-03 下午9:12
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
