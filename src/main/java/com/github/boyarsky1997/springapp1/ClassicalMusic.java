package com.github.boyarsky1997.springapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        Random random = new Random();
        int number = random.nextInt(3) + 1;
        switch (number) {
            case 3:
                return "Ludwig van Beethoven";
            case 2:
                return "Wolfgang Amadeus Mozart";
            case 1:
                return "Johann Sebastian Bach";
            default:
                return null;
        }

    }

}
