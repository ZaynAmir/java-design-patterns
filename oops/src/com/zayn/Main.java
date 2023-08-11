package com.zayn;

public class Main {

    public static void main(String[] args){
//        User user = new User("zain", 26);
//        user.sayHello();

        // using interface
//        TaxCalculator total22Tax = calculate22Tax();
//        float res = total22Tax.calculateTax();
//        System.out.println(res);

        // using direct object
//        TaxCalculator2023 total23Tax = new TaxCalculator2023();
//        float result = total23Tax.calculateTax();
//        System.out.println(result);

        var account = new Account();
        account.setBalance(104);
        account.getBalance();
        account.deposit(4);
        account.getBalance();
        account.widraw(8);
        account.getBalance();

    }


    public static TaxCalculator calculate22Tax(){
        return new TaxCalculator2022();
    }

}
