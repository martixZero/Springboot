package com.csii.spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by user on 16/10/2.
 */
@Service
public class FunctionService {

    public String sayHello(String word){
        return  "Hello "+word+" !";
    }
}
