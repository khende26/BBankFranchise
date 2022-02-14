package com.company;

public class Bank {

    private String nameOfCustomer;
    private int cashInVault;

    public int Deposit()
    {int Deposit = cashInVault + 500;
        return Deposit;

    }
    public int Withdrawl() {
        int Withdrawal = cashInVault - 500;
        return Withdrawal;}

    // "Set" accessor method / "setter":
    public void setNameOfCustomer(String newnameOfCustomer) {

        nameOfCustomer = newnameOfCustomer;
    }

    // "Get" accessor method / "getter":
    public String getNameOfCustomer() {

        return nameOfCustomer;
    }

    // "Set" accessor method / "setter":
    public void setCashInVault (int newcashInVault) {

        cashInVault = newcashInVault;
    }

    // "Get" accessor method / "getter":
    public int getcashInVault() {

        return cashInVault;
    }

}

