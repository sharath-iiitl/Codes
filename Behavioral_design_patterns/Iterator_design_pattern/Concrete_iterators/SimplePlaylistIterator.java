package Behavioral_design_patterns.Iterator_design_pattern.Concrete_iterators;

import Behavioral_design_patterns.Iterator_design_pattern.Playlist;
import Behavioral_design_patterns.Iterator_design_pattern.PlaylistIterator;

public class SimplePlaylistIterator implements PlaylistIterator{
    private Playlist playlist;
    private int index;
    public SimplePlaylistIterator(Playlist playlist){
        this.playlist=playlist;
        this.index=0;
    }

    @Override
    public boolean hasNext(){
        return index<playlist.getSongs().size();
    }

    @Override
    public String next(){
        return playlist.getSongs().get(index++);
    }
    
}
