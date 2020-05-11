package oop.review;

public class MusicApp {
    public static void main(String[] args) {

        Song[] trackList = {
                new Song("Anymore", "Goldfrapp"),
                new Song("Systemagic", "Goldfrapp"),
                new Song("Tigerman", "Goldfrapp"),
                new Song("Become the one", "Goldfrapp"),
                new Song("Ocean", "Goldfrapp")
        };

        Album record = new Album(trackList, "2017", "Mute Artists", "Silver eye");

        PlayableItem mp3Player = new PlayableItem();
        mp3Player.play(trackList[trackList.length-1]);
        mp3Player.play(record);

    }
}
