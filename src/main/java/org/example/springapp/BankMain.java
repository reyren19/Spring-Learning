package org.example.springapp;

import org.example.annotationspractice.AccountConfig;
import org.example.annotationspractice.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AccountConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        accountService.addAccount(1);
        accountService.addMoney(250);
        accountService.withdrawMoney(50);
        accountService.checkBalance();
    }
}
