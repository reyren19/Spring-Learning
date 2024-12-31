package org.example.aopPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(UserConfig.class);
        UserService service = ctx.getBean(UserService.class);
        service.addUser();
    }
}
