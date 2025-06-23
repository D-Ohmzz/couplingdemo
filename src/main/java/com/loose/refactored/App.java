package com.loose.refactored;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context
        = new ClassPathXmlApplicationContext("applicationConstructorInjectionRefactored.xml");

        
        UserManager u1 = (UserManager) context.getBean("myUserManagerWebService");
        UserManager u2 = (UserManager) context.getBean("myUserManagerUserDatabase");
        UserManager u3 = (UserManager) context.getBean("myUserManagerNewDatabase");
        System.out.println(u1.getUserInfo());
        System.out.println(u2.getUserInfo());
        System.out.println(u3.getUserInfo());
    }

}
