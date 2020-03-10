/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parking;

/**
 *
 * @author Saraf
 */
public class ParkingSpot {
    private String parkingSpotId;
    private boolean free;
    private VehiclesForParking parkedVehicle;

    public ParkingSpot(String parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
        this.free = true;
    }
    
    public void assignVehicle(VehiclesForParking vp) {
        this.free = false;
        this.parkedVehicle = vp;
    }
    
    public void removeVehicle() {
        this.free = true;
        this.parkedVehicle = null;
    }

    public boolean isFree() {
        return free;
    }

    public VehiclesForParking getParkedVehicle() {
        return parkedVehicle;
    }
    
    
    
    

    
    @Override
    public String toString() {
        return "ParkingSpot{" + "parkingSpotId=" + parkingSpotId + ", free=" + free + (free ? "" : "vehicle=" + parkedVehicle)+ '}';
    }
    
    
}
