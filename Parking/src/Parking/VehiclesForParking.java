/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parking;

import Vehicles.Vehicle;

/**
 *
 * @author Saraf
 */
public class VehiclesForParking {
    private Vehicle vehicle;
    private ParkingTicket parkingTicket;

    public VehiclesForParking(Vehicle Vehicle) {
        this.vehicle = Vehicle;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    
    

    @Override
    public String toString() {
        return "VehiclesForParking{" + "vehicle=" + vehicle + ", parkingTicket=" + parkingTicket + '}';
    }
    
    
}
