package ru.kgedev.app.impl;

import ru.kgedev.app.api.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Some jazz music";
    }
}
