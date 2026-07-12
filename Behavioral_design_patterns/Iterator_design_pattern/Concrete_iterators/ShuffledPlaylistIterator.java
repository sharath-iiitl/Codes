package Behavioral_design_patterns.Iterator_design_pattern.Concrete_iterators;

import java.util.ArrayList;
import java.util.Collections;

import Behavioral_design_patterns.Iterator_design_pattern.Playlist;
import Behavioral_design_patterns.Iterator_design_pattern.PlaylistIterator;

public class ShuffledPlaylistIterator implements PlaylistIterator{
    private Playlist playlist;
    private int index;
    private ArrayList<String> shuffledSongs;
    public ShuffledPlaylistIterator(Playlist playlist){
        this.playlist=playlist;
        this.shuffledSongs=new ArrayList<>(playlist.getSongs());
        Collections.shuffle(shuffledSongs);
        this.index=0;
    }

    @Override
    public boolean hasNext(){
        return index<shuffledSongs.size();
    }

    @Override
    public String next(){
        return shuffledSongs.get(index++);
    }
    
}
