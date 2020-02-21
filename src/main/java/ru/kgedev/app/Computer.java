package ru.kgedev.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static ru.kgedev.app.Genre.CLASSICAL;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " Playing: " + musicPlayer.playMusic(CLASSICAL);
    }
}
