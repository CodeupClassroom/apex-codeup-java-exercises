package oop.review;

public class PlayableItem {

    public void play(Album album){
        System.out.println("playing album: " + album.getName());
        for (Song currentSong: album.getTrackList()) {
            this.play(currentSong);
        }
    }

    public void play(Song song){
        System.out.println("Playing song: " + song.getTitle() + " from  " + song.getArtist());
    }

}
