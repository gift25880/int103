/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    private int promotion;
    private int sellAmount;
    
    public Product(String name, double price, int quantity) {
        this.name = (name == null) ? "" : name;
        this.price = (price < 0) ? 1 : price;
        this.quantity = (quantity < 0) ? 10 : quantity;
        this.promotion = 0;
        this.sellAmount = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getSellAmount() {
        return this.sellAmount;
    }
    
    public int getPromotion() {
        return this.promotion;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setSellAmount(int sellAmount) {
        this.sellAmount = sellAmount;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", quantity=" + quantity + ", promotion=" + promotion + ", sellAmount=" + sellAmount + '}';
    }
    
    
}
