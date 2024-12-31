package org.example.eventHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService {
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void registerUser(String username, boolean isAuthenticated){
        eventPublisher.publishEvent(new UserRegistrationEvent(this, username, isAuthenticated));
    }
}
