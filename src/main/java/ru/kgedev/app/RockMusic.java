package ru.kgedev.app;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements  Music {
    @Override
    public List<String> getSongs() {
        return Arrays.asList("Wind cries Mary", "Muster of puppets", "Night witches");
    }
}
