package ru.veselov.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("classpath: ru.veselov.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return  new RockMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(list());
    }
    @Bean
    public MetalMusic metalMusic(){
        return new MetalMusic();
    }
    @Bean
    public List<Music> list(){
        return new ArrayList<>(List.of(rockMusic(),classicalMusic(),metalMusic()));
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
