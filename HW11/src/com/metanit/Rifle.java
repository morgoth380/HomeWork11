package com.metanit;

public class Rifle extends Weapon { //класс винтовка
    public Rifle(String type) {
        super(type);
    }
    public void shooting(){
        System.out.println("pif-paf");
    }
}
