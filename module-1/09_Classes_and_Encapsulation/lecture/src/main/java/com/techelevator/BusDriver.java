package com.techelevator;

import com.techelevator.vehicle.Bus;

public class BusDriver {

    public static void main(String[] args) {

        Bus bussie = new Bus("funky town");
       // bussie.setRouteName("Funky town");
        System.out.println(bussie.getRouteName());
        bussie.addGas(10);
        System.out.println(bussie.getRemainingSeats());
        bussie.openDoor();
        System.out.println(bussie.isDoorOpen());
        bussie.board();


        Bus busBoring = new Bus("new");
        busBoring.setRouteName("Meh");
        System.out.println(busBoring.getRemainingSeats());

    }

}
