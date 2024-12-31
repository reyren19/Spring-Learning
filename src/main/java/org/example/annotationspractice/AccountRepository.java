package org.example.annotationspractice;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
    public void addMoney(int money){
        System.out.println("Added "+money+" to account");
    }

    public void withdrawMoney(int money){
        System.out.println("Withdrew "+money+" from account");
    }

    public void checkBalance(){
        System.out.println("Balance is enough");
    }
}
