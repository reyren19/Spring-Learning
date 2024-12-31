package org.example.eventHandling;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener {
    @EventListener
    public void handleUserRegistration(UserRegistrationEvent event){
        if(event.isAuthenticated()){
            System.out.println("Registered the user with username "+ event.getUsername());
        }
        else {
            System.out.println("Error registering user, not authenticated!!");
        }
    }

}
