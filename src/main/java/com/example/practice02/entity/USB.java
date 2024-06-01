package com.example.practice02.entity;

public class USB {
    private String Version;
    public USB(){

    }
    public USB(String version) {
        Version = version;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }
}
