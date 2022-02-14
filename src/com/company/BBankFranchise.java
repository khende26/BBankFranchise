package com.company;

public class BBankFranchise {

    public static void main(String[] args) {
        Bank myBank = new Bank();

        myBank.setNameOfCustomer("Karrisue");
        myBank.setCashInVault(100000);


        System.out.println("Balance after deposit = " + myBank.Deposit());
        System.out.println("Balance after withdrawal = " + myBank.Withdrawl());
    }}

