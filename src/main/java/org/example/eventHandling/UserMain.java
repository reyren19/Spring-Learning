package org.example.eventHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserAppConfig.class);
        UserAuthService service = context.getBean(UserAuthService.class);
        service.registerUser("raunak", true);

        service.registerUser("anora", false);
    }
}
