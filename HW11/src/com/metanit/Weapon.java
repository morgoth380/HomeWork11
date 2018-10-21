package com.metanit;

public class Weapon {          //Базовый класс "оружие"
    private String Type;       //тип оружия (огнестрельное/пневматическое)
    private String ReloadType; //тип перезаряда
    private int weight;        //вес
    private int totalLength;   //общая длина
    private int barrelLength;  //длина ствола
    private int cartridgeNums; //максимальное количество патронов
    private int curCartridgeNums; //текущее количество патронов

    /****************Конструктор*******************/
    public Weapon(String type) {
        this.Type = type;
    }


    public int getCurCartridgeNums() {
        return curCartridgeNums;
    }

    public Weapon() {
        this.Type = "FireArm";
    }

    public String getType() {
        return Type;
    }

    public void setReloadType(String reloadType) {
        ReloadType = reloadType;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setTotalLength(int totalLength) {
        this.totalLength = totalLength;
    }

    public void setBarrelLength(int barrelLength) {
        this.barrelLength = barrelLength;
    }

    public void setCartridgeNums(int cartridgeNums) {
        this.cartridgeNums = cartridgeNums;
    }

    public String getReloadType() {
        return ReloadType;
    }

    public int getWeight() {
        return weight;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public int getBarrelLength() {
        return barrelLength;
    }

    public int getCartridgeNums() {
        return cartridgeNums;
    }

    public void shooting(){
        System.out.println("Bum");
    }

    public void setCurCartridgeNums(int curCartridgeNums) {
        this.curCartridgeNums = curCartridgeNums;
    }

    public void reload(int num){ //функция перезаряда обоймы
        int tmp;
        tmp = (num > getCartridgeNums())? getCartridgeNums() : num; //ограничение по количеству патронов
        setCurCartridgeNums(tmp);
    }

    /********************Функции сравнения объектов*******************/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //если для сравнения передали тот же самый адрес то вернуть true
        if (o == null || this.getClass() != o.getClass()) return false; //если объекты разного класса

        Weapon arm = (Weapon) o;

        if (cartridgeNums != arm.cartridgeNums) return false; //если емкости обойм разные - то оружия разного типа
        if (barrelLength != arm.barrelLength) return false;   //если длины стволов разные - то оружия разного типа
        if (!ReloadType.equals(ReloadType)) return false;     //если типы перезаряда разные..
        if (!Type.equals(Type)) return false;                 //если ваще типы разные..
        return true; //иначе все ок
    }

    @Override
    public int hashCode() {
        int result = cartridgeNums;
        result = 31 * result + Type.hashCode();
        result = 31 * result + ReloadType.hashCode();
        return result;
    }
    /*******************************************************/

}
