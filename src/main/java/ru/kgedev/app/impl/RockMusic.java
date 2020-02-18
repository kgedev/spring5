package ru.kgedev.app.impl;

import ru.kgedev.app.api.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
