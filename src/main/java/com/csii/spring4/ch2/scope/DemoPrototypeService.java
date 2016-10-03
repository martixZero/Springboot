package com.csii.spring4.ch2.scope;/**
 * Created by user on 16/10/3.
 */

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Prototype Bean
 *
 * @author user
 * @create 2016 -10-03 下午10:57
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {


}
