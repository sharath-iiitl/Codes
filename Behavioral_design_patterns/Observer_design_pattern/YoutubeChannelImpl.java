package Behavioral_design_patterns.Observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

import Behavioral_design_patterns.Observer_design_pattern.Concrete_Interfaces.*;

public class YoutubeChannelImpl implements YoutubeChannel{
    private List<Subscriber> subscribers = new ArrayList<>();
    private String video;

    @Override
    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(){
        for(Subscriber subscriber:subscribers){
            subscriber.update(video);
        }
    }

    public void uploadNewVideo(String video){
        this.video = video;
        this.notifySubscribers();
    }
}
