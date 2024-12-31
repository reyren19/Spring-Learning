package org.example.annotationspractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository repository;
    @Autowired
    public AccountService(AccountRepository repository){
        this.repository=repository;
    }

    public void addMoney(int money){
        repository.addMoney(money);
    }

    public void withdrawMoney(int money){
        repository.withdrawMoney(money);
    }

    public void checkBalance(){
        repository.checkBalance();
    }

    public void deleteAccount(int id){
        System.out.println("Deleted account with id "+ id);
    }

    public void addAccount(int id){
        System.out.println("Added acc with id "+ id);
    }
}
