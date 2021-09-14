package com.github.boyarsky1997.springapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    private List<Music> listGenres;

    public MusicPlayer(List<Music> listGenres) {
        this.listGenres = listGenres;
    }

    @PostConstruct
    public void init() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Doing my destrction");
    }


    public void playMusic() {
        Random random = new Random();
        System.out.println("Playing... " + listGenres.get(random.nextInt(listGenres.size()) ).getSong());
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "listGenres=" + listGenres +
                '}';
    }
}
