package com.metanit;

public class Revolver extends Pistol {
    public Revolver(String type) {
        super(type);
    }

    public Revolver() {
        super("FireArm");
    }

    /*********Переопределение метода базового класса*************/
    @Override
    public void reload(int num){ //функция перезаряда обоймы
        setCurCartridgeNums(num); //тут принятое значение num не проверяется
    }

    /*******Перегрузка метода базового класса******************/
    public void shooting(int num){
        if(num < getCurCartridgeNums()){
            System.out.println("pif-paf");
        }

    }
}
