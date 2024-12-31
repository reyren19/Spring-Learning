package org.example.eventHandling;

import org.springframework.context.ApplicationEvent;

public class UserRegistrationEvent extends ApplicationEvent {
    private String username;
    private boolean isAuthenticated;

    public UserRegistrationEvent(Object source, String username, boolean isAuthenticated){
        super(source);
        this.username=username;
        this.isAuthenticated=isAuthenticated;
    }
    public String getUsername(){
        return username;
    }
    public boolean isAuthenticated(){
        return isAuthenticated;
    }
}
