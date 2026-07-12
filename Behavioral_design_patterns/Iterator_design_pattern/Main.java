package Behavioral_design_patterns.Iterator_design_pattern;

public class Main {
    public static void main(String[] args){
        Playlist playlist = new Playlist();
        playlist.addSong("Song1");
        playlist.addSong("Song3");
        playlist.addSong("Song4");
        playlist.addSong("Song2 Fav");
        System.out.println("Simple Playlist: ");
        PlaylistIterator simpleIterator = playlist.iterator("simple");
        while(simpleIterator.hasNext()){
            System.out.println("Playing: "+simpleIterator.next());
        }
        
        System.out.println("Shuffle Playlist: ");
        PlaylistIterator shuffleIterator = playlist.iterator("shuffled");
        while(shuffleIterator.hasNext()){
            System.out.println("Playing: "+shuffleIterator.next());
        }
        
    }
}
