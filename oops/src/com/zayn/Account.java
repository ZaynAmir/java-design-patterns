package com.zayn;
// Encapsulation
public class Account {
    private float balance;

    public float getBalance(){
        System.out.println(this.balance);
        return this.balance;
    }

    public void setBalance(float balance){
        if(balance > 0)
            this.balance = balance ;
    }

    public void deposit(float balance){
        if(balance > 0)
            this.balance += balance ;
    }

    public void widraw(float amount){
        if(amount > 0)
            this.balance -= amount ;
    }
}
