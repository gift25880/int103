/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class VendingMachine {
    private Product[] products;
    private long machineId;
    private int productCounting;
    private double machineMoney;
    private double customerMoney;
    
    public VendingMachine(Product products, long machineId, int numberOfProducts, int money) {
        this.machineId = machineId;
        if (numberOfProducts > 15) {
            this.products = new Product[15];
        } else if (numberOfProducts < 1) {
            this.products = new Product[1];
        } else {
            this.products = new Product[numberOfProducts];
        }
        this.products[0] = products;
        this.machineMoney = (money < 0) ? 1000 : money;
        this.customerMoney = 0;
        this.productCounting = 1;
    }
    
    public boolean isFull() {
        return products != null && this.productCounting == products.length;
    }
    
    public boolean addProduct(String name, double price, int quantity) {
        if (isFull() || name == null || price < 0 || quantity < 0) {
            return false;
        } else {
            Product newProduct = new Product(name, price, quantity);
            products[productCounting++] = newProduct;
            return true;
        }
    }
    
    public boolean addProduct(Product p) {
        if (isFull() || p == null) {
            return false;
        } else {
            products[productCounting++] = p;
            //productCounting++;
            return true;
        }
    }
    
    public boolean addPromotion(int slot, int amount) {
        if (amount < 0 || products[slot-1] == null) {
            return false;
        } else {
            this.products[slot].setPromotion(amount);
            return true;
        }
    }
    
    public boolean insertMoney(double amount) {
        if (amount < 0) {
            return false;
        } else {
            customerMoney += amount;
            return true;
        }
    }
    
    public double returnMoney() {
        this.customerMoney = 0;
        return this.customerMoney;
    }
    
    public boolean buy(int slot, int amount) {
        double price;
        price = amount * products[slot-1].getPrice();
        if (price <= customerMoney && amount <= products[slot-1].getQuantity() && products[slot-1] != null) {
            this.customerMoney -= price;
            this.machineMoney += price;
            products[slot-1].setSellAmount(products[slot-1].getSellAmount() + amount);
            products[slot-1].setQuantity(products[slot-1].getQuantity() - amount);
            return true;
        } else {
            return false;
        }
    }
    
    public Product getProduct(int slot) {
        if (products[slot-1] == null) {
            return null;
        } else {
            return products[slot-1];   
        }
    }
    
    public boolean deleteProduct(int slot) {
        if (products[slot-1] == null) {
            return false;
        } else {
            products[slot-1] = null;   
            for (int i = slot-1; i < productCounting-1; i++) {
                products[i] = products[i+1];
                products[i+1] = null;
            }
            productCounting--;
            return true;
        }        
    }
    
    public boolean expand(int size) {
        if (productCounting == 15 || size < 1) {
            return false;
        } else {
            Product[] temp;
            if (size + products.length > 15) {
                temp = new Product[15];
            } else {
                temp = new Product[size + products.length];
            }
            System.arraycopy(products, 0, temp, 0, products.length);
            products = temp;
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder s1 = new StringBuilder();
        s1.append("VendintMachine ID : " + this.machineId + "\n");
        s1.append("Total Product     : " + this.productCounting + "\n");
        s1.append("Machine Money     : " + this.machineMoney + "\n");
        s1.append("Customer Money    : " + this.customerMoney + "\n");
        s1.append("================================================================================\n\n");
        for (int i = 0; i < this.productCounting; i++) {
            s1.append(products[i].getName() + "\n");
            s1.append("price      : " +products[i].getPrice() + "\n");
            s1.append("Quantity   : " +products[i].getQuantity() + "\n");
            s1.append("SellAmount : " +products[i].getSellAmount() + "\n\n");
        }
        s1.append("================================================================================\n");
        
        return s1.toString();
    }
    
    
    
}
