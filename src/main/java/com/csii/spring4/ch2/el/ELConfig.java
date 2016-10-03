package com.csii.spring4.ch2.el;/**
 * Created by user on 16/10/3.
 */

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * el config
 *
 * @author user
 * @create 2016 -10-03 下午11:18
 */
@Configuration
@ComponentScan("com.csii.spring4.ch2.el")
@PropertySource("classpath:com/csii/spring4/ch2/el/test1.properties")
public class ELConfig {
    @Value("i love you!")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T (java.lang.Math).random() * 100.0}")
    private double randomNumber;
    @Value("#{demoService.another}")
    private String fromAnother;
  //  @Value("classpath:com/csii/spring4/ch2/el/test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;
    @Value("${code.name}")
    private String codeName;
    @Autowired
    private Environment environment;

    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {

        return new PropertySourcesPlaceholderConfigurer();
    }


    public void outputResource(){

        System.out.println(normal);


        System.out.println(osName);

        System.out.println(randomNumber);

        System.out.println(fromAnother);

        try {
            System.out.println(IOUtils.toString(testFile.getInputStream()));

            System.out.println(IOUtils.toString(testUrl.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }




        System.out.println(environment.getProperty("code.author"));
    }
}
