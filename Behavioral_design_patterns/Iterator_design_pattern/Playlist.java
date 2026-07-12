package Behavioral_design_patterns.Iterator_design_pattern;

import java.util.ArrayList;

import Behavioral_design_patterns.Iterator_design_pattern.Concrete_iterators.FavoritesPlaylistIterator;
import Behavioral_design_patterns.Iterator_design_pattern.Concrete_iterators.ShuffledPlaylistIterator;
import Behavioral_design_patterns.Iterator_design_pattern.Concrete_iterators.SimplePlaylistIterator;

public class Playlist {
    private ArrayList<String> songs;
    
    public Playlist(){
        songs = new ArrayList<>();
    }

    public void addSong(String song){
        songs.add(song);
    }

    public PlaylistIterator iterator(String type){
        switch (type) {
            case "simple":
                return new SimplePlaylistIterator(this);
            case "shuffled":
                return new ShuffledPlaylistIterator(this);
            case "favorites":
                return new FavoritesPlaylistIterator(this);
            default:
                return null;
        }
    }

    public ArrayList<String> getSongs(){
        return songs;
    }
}
