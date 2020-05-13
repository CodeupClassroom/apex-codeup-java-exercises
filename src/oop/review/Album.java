package oop.review;

public class Album implements Playable {

    private Song[] trackList;
    private String releaseDate;
    private String label;
    private String name;

    public Album(Song[] trackList, String releaseDate, String label, String name) {
        this.trackList = trackList;
        this.releaseDate = releaseDate;
        this.label = label;
        this.name = name;
    }

    public Song[] getTrackList() {
        return trackList;
    }

    public void setTrackList(Song[] trackList) {
        this.trackList = trackList;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing album: " + this.getName());
        for (Song currentSong : this.getTrackList()) {
            currentSong.play();
        }
    }
}