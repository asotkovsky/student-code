package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        BuyoutAuction buyoutAuction = new BuyoutAuction("Head First Java", 15);

        buyoutAuction.placeBid( new Bid("John", 10) );
        buyoutAuction.placeBid( new Bid("Rachelle", 12));

        ReserveAuction reserveAuction = new ReserveAuction("Tech Elevator Hat", 12);
        reserveAuction.placeBid( new Bid("Steve", 8) );
        reserveAuction.placeBid( new Bid("Matt", 14));


        Auction reserveAsAuction = reserveAuction;

        ReserveAuction backToReserve = (ReserveAuction) reserveAsAuction;


        Bid bidOne = new Bid("A", 10);
        Bid bidTwo = new Bid("A", 10);

        System.out.println(bidOne.toString());

        if (bidOne.equals(bidTwo)) {
            System.out.println("Bids are the same");
        }

        List<Auction> auctions = new ArrayList<Auction>();
        auctions.add(generalAuction);
        auctions.add(reserveAuction);
        auctions.add(buyoutAuction);


        for (Auction currentAuction : auctions) {
            currentAuction.placeBid(new Bid("Rachelle", 18));
        }


    }
}
