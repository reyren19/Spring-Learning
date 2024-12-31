package org.example.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        DatabaseBean myBean = ctx.getBean(DatabaseBean.class);
        myBean.performTransaction();
        ctx.close();
    }
}
