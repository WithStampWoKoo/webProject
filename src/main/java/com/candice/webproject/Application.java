package com.candice.webproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by candice on 2018/4/13.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.candice.webproject")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
