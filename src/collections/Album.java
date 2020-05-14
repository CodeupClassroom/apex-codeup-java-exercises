package collections;

import oop.review.Song;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;

    public Album() {
        // We do this so we don't waste memory initializing the array if there no songs at first while you create albums
        this.songs = new ArrayList<>();
    }
}
