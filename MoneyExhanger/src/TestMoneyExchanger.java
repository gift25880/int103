    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class TestMoneyExchanger {
    
    public static void main(String[] args) {
        MoneyExchanger mx = new MoneyExchanger(0.50, 500); 
        mx.receiveForeignUnitsFromAdmin(100); 
        mx.receiveForeignUnitsFromAdmin(300); 
        mx.receiveBahtFromCustomer(800); 
        mx.receiveBahtFromCustomer(240); 
        System.out.println(mx); 
        System.out.println(mx.exchangeToForeignUnitsForCustomer(250)); 
        System.out.println(mx); 
        System.out.println(mx.giveAllCollectedBahtToAdmin()); 
        System.out.println(mx); 
    }
    
}
