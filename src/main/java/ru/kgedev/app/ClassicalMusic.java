package ru.kgedev.app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

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
