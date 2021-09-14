package com.github.boyarsky1997.springapp1.genres;

import com.github.boyarsky1997.springapp1.Music;

import java.util.Random;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        Random random = new Random();
        int number = random.nextInt(3) + 1;
        switch (number) {
            case 3:
                return "Wanessa";
            case 2:
                return "Sandy e Junior";
            case 1:
                return "Sandy Leah";
            default:
                return null;
        }
    }


}
