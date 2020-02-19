package ru.kgedev.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kgedev.app.impl.ClassicalMusic;

import static org.junit.jupiter.api.Assertions.*;

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
    }

    @Test
    void testScopePrototype() {
        assertNotEquals(firstMusicPlayer, secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        assertNotEquals(firstMusicPlayer.getVolume(), secondMusicPlayer.getVolume());

        firstMusicPlayer.playMusic();

    }

    @Test
    void testInitDestroyMethods() {
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        //scope=singleton but classical music create with factory-method witch return new instance of ClassicalMusic
        assertEquals(classicalMusic1, classicalMusic2);
        System.out.println(classicalMusic1.getSong());
    }
}