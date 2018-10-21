package com.metanit;

public class Main {

    public static void main(String[] args) {
        Revolver Nagan = new Revolver(); //револьвер 1
        Revolver Magnum1 = new Revolver();  //револьвер 2
        Revolver Magnum2 = new Revolver();  //револьвер 3

        Nagan.setCartridgeNums(6);
        Nagan.setWeight(300);
        Nagan.setTotalLength(200);
        Nagan.setBarrelLength(80);
        Nagan.setReloadType("Manual");

        Magnum1.setCartridgeNums(6);
        Magnum1.setWeight(300);
        Magnum1.setTotalLength(200);
        Magnum1.setBarrelLength(80);
        Magnum1.setReloadType("Manual");

        Magnum2.setCartridgeNums(8);
        Magnum2.setWeight(300);
        Magnum2.setTotalLength(200);
        Magnum2.setBarrelLength(80);
        Magnum2.setReloadType("Manual");

        if(Nagan.equals(Magnum1)){
            System.out.println("same type");
        }else{
            System.out.println("not same type");
        }

        if(Nagan.equals(Magnum2)){
            System.out.println("same type");
        }else{
            System.out.println("not same type");
        }
    }
}
