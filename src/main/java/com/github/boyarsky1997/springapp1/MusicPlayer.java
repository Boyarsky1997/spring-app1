package com.github.boyarsky1997.springapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Genre genre) {
        if (Genre.CLASSICAL.equals(genre)) {
            System.out.println("Playing... " + music1.getSong());
        }
        if (Genre.ROCK.equals(genre)) {
            System.out.println("Playing... " + music2.getSong());
        }
    }

    //IoC
    public MusicPlayer() {
    }


}
