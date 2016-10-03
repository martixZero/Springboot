package com.csii.spring4.ch1.aop;/**
 * Created by user on 16/10/3.
 */

import org.springframework.stereotype.Service;

/**
 * Service
 *
 * @author user
 * @create 2016 -10-03 下午9:16
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){};
}
