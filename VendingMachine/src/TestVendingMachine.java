/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class TestVendingMachine {
    public static void main(String[] args) {
        Product p1 = new Product("Pepsi", 15, 5);
        Product p2 = new Product("Coke", 20, 10);
        Product p3 = new Product("Oishii", 30, 8);
        Product p4 = new Product("Ichitan", 20, 5);
        Product p5 = new Product("Water", 10, 10);
        
        VendingMachine v1 = new VendingMachine(p1, 1234567890, 6, 0);
        v1.addProduct(p2);
        v1.addProduct(p3);
        v1.addProduct(p4);
        v1.addProduct(p5);
        v1.addProduct("Milk", 26.75, 6);
        
        System.out.println(v1);
        
        System.out.println(v1.isFull());
        System.out.println(v1.expand(3));
        
        Product p7 = new Product("Betagen", 10, 5);
        Product p8 = new Product("Coffee", 18, 4);
        
        v1.addProduct(p7);
        v1.addProduct(p8);
        System.out.println(v1);
        System.out.println(v1.getProduct(7));
        
        v1.deleteProduct(3);
        System.out.println(v1);
        
        v1.insertMoney(30);
        System.out.println(v1.buy(7, 1));
        System.out.println(v1);
        System.out.println(v1.returnMoney());
        System.out.println(v1);
        
    }
}
