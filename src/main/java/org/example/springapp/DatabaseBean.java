package org.example.springapp;

public class DatabaseBean {
    public void dbStart(){
        System.out.println("Loaded data to DB! ");
    }

    public void dbClose(){
        System.out.println("Session completed, db shutting down! ");
    }

    public DatabaseBean(){
        System.out.println("Db initialized");
    }

    public void performTransaction(){
        System.out.println("Transaction in progress");
    }
}
