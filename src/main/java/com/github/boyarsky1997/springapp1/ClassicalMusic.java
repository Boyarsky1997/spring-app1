package com.github.boyarsky1997.springapp1;

public class ClassicalMusic implements Music {

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "hans zimmer - time";
    }

}
