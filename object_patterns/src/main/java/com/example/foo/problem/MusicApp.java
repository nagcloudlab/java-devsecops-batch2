package com.example.foo.problem;

class Track {
    String title;
    int duration;
    int rating;

    public Track(String title, int duration, int rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }
}

class PlayList {
    Track[] tracks = {
            new Track("A", 5, 2),
            new Track("B", 3, 4),
            new Track("C", 1, 4),
            new Track("D", 2, 5),
    };

    public Track getNextTrack() {
        // random track..
        int randomIndex = (int) (Math.random() * tracks.length);
        return tracks[randomIndex];
    }
}


public class MusicApp {
    public static void main(String[] args) {

        PlayList playList = new PlayList();
        System.out.println(playList.getNextTrack().title);
        System.out.println(playList.getNextTrack().title);

        // play-list : high-rating-track fist...

        // play-list : long-duration-track fist...

    }
}
