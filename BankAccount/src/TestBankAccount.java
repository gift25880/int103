/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount sudaBA = new BankAccount(new Person(3100001187911L, "Suda", "Meejai"), 2, 1500.0);
        sudaBA.addAccountOwner(3876234518158L , "Pornpat", "Dee");
        
        BankAccount giftBA = new BankAccount(new Person(62130500048L, "Pathinya", "Thonguam"), 2, 5000.0);
        System.out.println("Suda deposit:"+sudaBA.deposit(100));
        System.out.println(sudaBA);
        System.out.println("Gift deposit:"+giftBA.deposit(500));
        System.out.println(giftBA);
        System.out.println("Suda withdraw:"+sudaBA.withdraw(10));
        System.out.println("G   ift withdraw:"+giftBA.withdraw(100));
        System.out.println(sudaBA);
        System.out.println(giftBA);
        System.out.println(giftBA.addAccountOwner(1212121212121L, "Supot", "Lee"));
        sudaBA.transfer(giftBA, 500);
        System.out.println(sudaBA);
        System.out.println(giftBA);
    }
}
