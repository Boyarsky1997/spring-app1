package com.github.boyarsky1997.springapp1;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "30 seconds to Mars";
    }
}
