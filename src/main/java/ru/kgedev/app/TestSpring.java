package ru.kgedev.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(player.getName());
        System.out.println(player.getVolume());

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());

        ClassicalMusic cm1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic cm2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println("Is cm1 = cm2 ? - " + (cm1 == cm2));

        context.close();
    }
}
