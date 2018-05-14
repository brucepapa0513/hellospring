package com.bruce.hellospring.demo2;

import org.springframework.stereotype.Component;

@Component
public class WestCity implements CompactDisc {

    private String title = "West City's My Love";
    private String artist = "West City";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
