package com.example.practice02.entity;

public class SoundCard {
    private USB usb;
    public SoundCard(){

    }
    public SoundCard(USB usb) {
        this.usb = usb;
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }
}
