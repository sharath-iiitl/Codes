package Behavioral_design_patterns.Mediator_design_pattern;

public class AuctionMediatorDemo {
    public static void main(String[] args){
        AuctionMediator auctionHouse = new AuctionHouse();
        Bidder bidder1=new Bidder("Alice",auctionHouse);
        Bidder bidder2=new Bidder("Bob",auctionHouse);
        Bidder bidder3=new Bidder("Charlie",auctionHouse);

        auctionHouse.registerBidder(bidder1);
        auctionHouse.registerBidder(bidder2);
        auctionHouse.registerBidder(bidder3);

        bidder1.placeBid(100);
        bidder2.placeBid(100);
        bidder3.placeBid(100);
    }
}
