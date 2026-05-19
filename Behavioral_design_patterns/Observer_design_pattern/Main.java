package Behavioral_design_patterns.Observer_design_pattern;


import Behavioral_design_patterns.Observer_design_pattern.Concrete_Subscribers.EmailSubscriber;
import Behavioral_design_patterns.Observer_design_pattern.Concrete_Subscribers.YoutubeSubscriber;

public class Main {
    public static void main(String[] args){
        YoutubeChannelImpl channel = new YoutubeChannelImpl();

        EmailSubscriber alice = new EmailSubscriber("Alice@gmail.com");
        YoutubeSubscriber bob = new YoutubeSubscriber("Bob");

        channel.addSubscriber(bob);
        channel.addSubscriber(alice);

        channel.uploadNewVideo("lalalalala...");
        
        channel.removeSubscriber(bob);
        
        channel.uploadNewVideo("lalalalala...");

    }
}
