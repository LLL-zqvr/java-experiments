package com.example.practice01.resource;

import com.example.practice01.entity.Apple;

import java.util.List;

public class DatabaseUtils {
    private static final List<Apple> APPLES = create();
    private static List<Apple> create(){
        Apple a = new Apple(1,Apple.Color.RED,200 );
        Apple a1 = new Apple(1,Apple.Color.RED,200 );
        Apple a2 = new Apple(1,Apple.Color.RED,200 );
        Apple a3 = new Apple(1,Apple.Color.RED,200 );
        Apple a4 = new Apple(1,Apple.Color.RED,200 );
        return List.of(a,a1,a2,a3,a4);
    }
    public static List<Apple>appleList(){return APPLES;}
}
