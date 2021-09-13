package com.github.boyarsky1997.springapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic musicBean = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(musicBean.getSong());
        //        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();

//        MusicPlayer musicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.setVolume(777);
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}
