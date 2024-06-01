package com.example.practice02.entity;

public class Computer {
    private SoundCard soundCard;
    public Computer(){

    }
    public Computer(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
}
