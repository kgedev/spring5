package ru.kgedev.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Genre genre) {
        String track;
        if (genre == Genre.CLASSICAL) {
            track = playRandomMusic(music1);
        } else {
            track = playRandomMusic(music2);
        }
        return track;
    }

    private String playRandomMusic(Music music) {
        int randomTrackNumber = new Random().nextInt(music.getSongs().size());
        return music.getSongs().get(randomTrackNumber);
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }
}
