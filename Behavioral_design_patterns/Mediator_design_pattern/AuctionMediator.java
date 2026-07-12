package Behavioral_design_patterns.Mediator_design_pattern;

public interface AuctionMediator {
    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder,int amount);
}
