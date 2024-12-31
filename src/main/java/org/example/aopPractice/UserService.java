package org.example.aopPractice;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void addUser(){
        System.out.println("User added!");
    }
    public void removeUser(){
        System.out.println("User removed!");
    }
}
