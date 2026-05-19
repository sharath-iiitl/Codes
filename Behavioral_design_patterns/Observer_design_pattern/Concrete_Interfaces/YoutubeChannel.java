package Behavioral_design_patterns.Observer_design_pattern.Concrete_Interfaces;

public interface YoutubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
}
