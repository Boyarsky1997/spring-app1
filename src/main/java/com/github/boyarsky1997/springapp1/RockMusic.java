package com.github.boyarsky1997.springapp1;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        Random random = new Random();
        int number = random.nextInt(3) + 1;
        switch (number) {
            case 3:
                return "Red Hot Chili Peppers";
            case 2:
                return "The Beatles";
            case 1:
                return "Muse";
            default:
                return null;
        }
    }
}
