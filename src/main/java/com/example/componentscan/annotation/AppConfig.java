package com.example.componentscan.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration //Specifies that this class is a config file
@ComponentScan(basePackages= "com.example.componentscan.annotation")
public class AppConfig {

}
