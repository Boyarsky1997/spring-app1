package com.github.boyarsky1997.springapp1.config;

import com.github.boyarsky1997.springapp1.Music;
import com.github.boyarsky1997.springapp1.MusicPlayer;
import com.github.boyarsky1997.springapp1.genres.ClassicalMusic;
import com.github.boyarsky1997.springapp1.genres.PopMusic;
import com.github.boyarsky1997.springapp1.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("com.github.boyarsky1997.springapp1")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    List<Music> listGenres(){
        return Arrays.asList(classicalMusic(),popMusic(),rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(listGenres());
    }
}
