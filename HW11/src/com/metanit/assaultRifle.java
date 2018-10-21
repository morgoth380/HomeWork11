package com.metanit;

public class assaultRifle extends Weapon{  //класс автоматическая винтовка

    public assaultRifle(String type) {
        super(type);
    }
    public void shooting(){
        System.out.println("tra-ta-ta-ta");
    }
}
