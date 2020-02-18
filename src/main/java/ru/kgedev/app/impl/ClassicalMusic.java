package ru.kgedev.app.impl;

import ru.kgedev.app.api.Music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
