
import Vehicles.Car;
import Vehicles.Truck;
import Vehicles.Vehicle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Car("ab123");
        Vehicle v2 = new Truck("bc456");
        
        System.out.println(v1);
        System.out.println(v2);
    }
}
