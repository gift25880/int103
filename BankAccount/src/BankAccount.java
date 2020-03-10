/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class BankAccount {
    private long accountId;
    private Person[] accountOwners;
    private double balance;
    private int accountOwnerCounting;
    
    public BankAccount(Person firstPersonForAccountOwner, int numberOfAccountOwners, double balance) {
        this.accountId = firstPersonForAccountOwner.getIdCard();
        if (numberOfAccountOwners > 5) {
            this.accountOwners = new Person[5];
        } else {
            this.accountOwners = new Person[numberOfAccountOwners];
        }
        this.accountOwners[accountOwnerCounting++] = firstPersonForAccountOwner;
        this.balance = balance;
    }
    
    public boolean addAccountOwner(long idCard, String fName, String lName) {
        if (this.accountOwnerCounting >= this.accountOwners.length) {
            return false;
        }
        accountOwners[accountOwnerCounting++] = new Person(idCard, fName, lName);
        return true;
    }
    
    public long getAccountId() {
        return this.accountId;
    }
    
    public Person[] getAccountOwners() {
        Person[] temp = new Person[accountOwnerCounting];
        for (int i = 0; i < accountOwnerCounting; i++) {
            temp[i] = accountOwners[i];
        }
        return temp;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public boolean withdraw(double amount) {
        if (amount > this.balance || amount <= 0) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }
    
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        } else {
            this.balance += amount;
            return true;
        }
    }
    
    public boolean transfer(BankAccount targetAccount, double amount) {
        if (amount <= 0 || this.balance < amount) {
            return false;
        } else {
            withdraw(amount);
            targetAccount.deposit(amount);
            return true;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder ac = new StringBuilder(accountId + "\n");
        for (int i = 0; i < accountOwnerCounting; i++) {
            ac.append(accountOwners[i] + "\n");
        }
        ac.append("balance=" + balance+"\n");
        return ac.toString();
    }
}
