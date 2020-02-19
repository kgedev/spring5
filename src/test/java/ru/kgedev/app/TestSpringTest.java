package ru.kgedev.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TestSpringTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

    @AfterEach
    void afterEach() {
        context.close();
    }


    @Test
    void testScopeSingleton() {
        assertEquals(firstMusicPlayer, secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        assertEquals(firstMusicPlayer.getVolume(), secondMusicPlayer.getVolume());


        firstMusicPlayer.playMusic();
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());
    }

    @Test
    void testScopePrototype() {
        assertNotEquals(firstMusicPlayer, secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        assertNotEquals(firstMusicPlayer.getVolume(), secondMusicPlayer.getVolume());


        firstMusicPlayer.playMusic();
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());
    }
}