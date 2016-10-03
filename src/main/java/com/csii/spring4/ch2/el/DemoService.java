package com.csii.spring4.ch2.el;/**
 * Created by user on 16/10/3.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * DemoService
 *
 * @author user
 * @create 2016 -10-03 下午11:10
 */
@Service
public class DemoService {
    @Value("其他类的属性")
    private String another;

    public String getAnother(){
        return another;
    }
    public void setAnother(String another){
        this.another=another;
    }
}
