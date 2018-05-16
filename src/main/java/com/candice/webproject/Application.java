package com.candice.webproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by candice on 2018/4/13.
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "com.candice.webproject")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
