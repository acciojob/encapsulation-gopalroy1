package com.driver;

public class RWOnly {
    private int random=9;
    public int getter(){
        return this.random;
    }

    public void setter(int number){
        random = number;
    }
}
