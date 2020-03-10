/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class TicketMachine {
    private double ticketPrice;
    private int numberOfTickets;
    private int numberOfCoins;
    private int customerCoins;
    
    public TicketMachine(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
    
    public TicketMachine(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
    public TicketMachine(double ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
    
    public double getTicketPtice() {
        return this.ticketPrice;
    }
    
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
    public int getNumberOfTickets() {
        return this.numberOfTickets;
    }
    
    public int getNumberOfCoins() {
        return this.numberOfCoins;
    }
    
    public int getCustomerCoins() {
        return this.customerCoins;
    }
    
    @Override
    public String toString() {
        return String.format("TicketMachine{ticket price= %.2f, %d tickets, %d coins, customer %d coins}",
                ticketPrice, numberOfTickets, numberOfCoins, customerCoins);
    }
    
    public void receiveTicketsFromAdmin(int tickets) {
        this.numberOfTickets += tickets;
    }
    
    public int giveAllCoinsToAdmin() {
        int coins = this.numberOfCoins;
        this.numberOfCoins = 0;
        return coins;
    }
    
    public void receiveCoinsFromCustomer(int coins) {
        this.customerCoins += coins;
    }
    
    public int sellTicketsToCustomer(int tickets) {
        int payment = (int) Math.ceil(tickets * this.ticketPrice);
        if (this.numberOfTickets < tickets) {
            return -1;
        } else if (this.customerCoins < payment) {
            return -2;
        } else {
            this.numberOfTickets -= tickets;
            this.numberOfCoins += payment;
            this.customerCoins -= payment;
            return returnCoinsToCustomer();
        }
    }
    
    public int returnCoinsToCustomer() {
        int coins = this.customerCoins;
        this.customerCoins = 0;
        return coins;
    }
}
