package Vehicles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public abstract class Vehicle {
    private String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    
    
    
    
    public String getLicensePlate() {
        return this.licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicles{" + "licensePlate=" + licensePlate + '}';
    }
    
    
}
