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

        Playable record = new Album(trackList, "2017", "Mute Artists", "Silver eye");
        Playable song = trackList[0];

        song.play();
        record.play();

    }
}
