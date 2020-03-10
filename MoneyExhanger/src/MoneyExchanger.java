/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class MoneyExchanger {
    private double exchangeRate;
    private int foreignUnits;
    private int collectedBaht;
    private int customerBaht;
    
    public MoneyExchanger(int foreignUnits) {
        this.foreignUnits = foreignUnits;
    }
    
    public MoneyExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    
    public MoneyExchanger(double exchangeRate, int foreignUnits) {
        this.exchangeRate = exchangeRate;
        this.foreignUnits = foreignUnits;
    }
    
    public double getExchangeRate() {
        return this.exchangeRate;
    }
    
    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    
    public int getForeignUnits() {
        return this.foreignUnits;
    } 
    
    public int getCollectedBaht() {
        return this.collectedBaht;
    }
    
    public int getCustomerBaht() {
        return this.customerBaht;
    }
    
    @Override
    public String toString() {
        return String.format("Exchanger{rate=%.2f, foreign %d units, collected %d baht, customer adds %d baht}",
                exchangeRate,foreignUnits,collectedBaht,customerBaht);
    }
    
    public void receiveForeignUnitsFromAdmin(int foreignUnits) {
        this.foreignUnits += foreignUnits;
    }
    
    public int giveAllCollectedBahtToAdmin() {
        int baht = this.collectedBaht;
        this.collectedBaht = 0;
        return baht;
    }
    
    public void receiveBahtFromCustomer(int baht) {
        this.customerBaht += baht;
    }
    
    public int exchangeToForeignUnitsForCustomer(int foreignUnits) {
     int payment = (int) Math.ceil(foreignUnits /exchangeRate);
     if (this.foreignUnits < foreignUnits) {
         return -1;
     } 
     else if (this.customerBaht < payment) {
        return -2;
     } else {
         this.foreignUnits -= foreignUnits;
         this.collectedBaht += payment;
         this.customerBaht -= payment;
         return returnBahtToCustomer();
     }
    }
    
    public int returnBahtToCustomer() {
        int baht = this.customerBaht;
        this.customerBaht = 0;
        return baht;
    }
}
