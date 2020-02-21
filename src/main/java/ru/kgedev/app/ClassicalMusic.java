package ru.kgedev.app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    @Override
    public List<String> getSongs() {
        return Arrays.asList(
                "Dreaming",
                "Love in Venice",
                "Hungarian Rhapsody",
                "An aria of Mjuzety",
                "An form is dead",
                "Walzer a la Paganini",
                "Secret agent",
                "Iota");
    }
}
