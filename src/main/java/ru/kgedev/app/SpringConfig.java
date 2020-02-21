package ru.kgedev.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.kgedev.app")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
