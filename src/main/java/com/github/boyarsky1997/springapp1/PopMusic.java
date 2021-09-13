package com.github.boyarsky1997.springapp1;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Pop music";
    }
}
