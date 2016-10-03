package com.csii.spring4.ch1.aop;/**
 * Created by user on 16/10/3.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Aopconfig
 *
 * @author user
 * @create 2016 -10-03 下午10:04
 */
@Configuration
@ComponentScan("com.csii.spring4.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {


}
