package Behavioral_design_patterns.Observer_design_pattern.Concrete_Subscribers;

import Behavioral_design_patterns.Observer_design_pattern.Concrete_Interfaces.Subscriber;

public class YoutubeSubscriber implements Subscriber{
    private String name;
    public YoutubeSubscriber(String name){
        this.name=name;
    }

    @Override
    public void update(String video){
        System.out.println("Sending email to " + video + ": New video uploaded: " + video);
    }
}
