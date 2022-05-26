package com.techelevator;

import com.techelevator.vehicle.Bus;

public class BusDriver {

    public static void main(String[] args) {

        Bus bussie = new Bus("Go to crazy town");
        //bussie.setRouteName("Go to crazy town");
        Bus busBoring = new Bus();
        busBoring.setRouteName("Meh");
        System.out.println(bussie.getRemainingSeats());
        System.out.println(busBoring.getRemainingSeats());
        bussie.openDoor();
        System.out.println(bussie.board());
        System.out.println(bussie.getRemainingSeats());
        System.out.println(busBoring.getRemainingSeats());

    }
}
