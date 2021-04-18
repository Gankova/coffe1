package com.company;

public abstract class coffeeMachine {
    public String brand;
    public float maxvolumeWater;
    public float maxvolumeCoffee;

    public void Brand (){ // вопрос может нужно удалить
        System.out.println(brand);
    }
    public void Volume(int waterV, int coffeeV ){

        System.out.print(waterV);
        System.out.print("l Volume water");
        System.out.println();
        System.out.print(coffeeV);
        System.out.print("g Volume coffee");// удалить до этого момента
        System.out.println();
    }


}
