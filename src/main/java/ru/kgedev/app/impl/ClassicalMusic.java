package ru.kgedev.app.impl;

import ru.kgedev.app.api.Music;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic buildClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("doing my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
