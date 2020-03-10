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
public class ParkingLot {
    private ParkingSpot[] parkingSpots;
    private int count;

    public ParkingLot(int maxCapacity) {
        parkingSpots = new ParkingSpot[maxCapacity];
        createParkingSpots();
    }
    
    private void createParkingSpots() {
        for (int i = 0; i < parkingSpots.length; i++) {
            parkingSpots[i] = new ParkingSpot(i+1+"A");
        }
    }

    public void entryPoint(VehiclesForParking vehicle) {
        int freeSpot = getAvailableSpot();
        if (freeSpot == -1) {
            System.out.println("Parking lot is full");
        } else {
            parkingSpots[freeSpot].assignVehicle(vehicle);
            count++;
        }
    }
    
    public void exitPoint(VehiclesForParking vehicle) {
        int found = searchVehicleParkingSpot(vehicle);
        parkingSpots[found].removeVehicle();
        //return ticket
        //pay fee
        count--;
    }
    
    public int searchVehicleParkingSpot(VehiclesForParking vehicle) {
        for (int i = 0; i < parkingSpots.length; i++) {
            if ((vehicle.getVehicle()).equals(parkingSpots[i].getParkedVehicle().getVehicle())) {
                return 1;
            }
        }
        return -1;
    }
    
    
    public int getAvailableSpot() {
        if (count == parkingSpots.length) {
            return -1;
        }
        for (int i = 0; i < parkingSpots.length; i++) {
            if (parkingSpots[i].isFree()) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < parkingSpots.length; i++) {
            string.append(parkingSpots[i]);
        }
        return string.toString();
    }
    
    
}
