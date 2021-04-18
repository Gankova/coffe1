package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        M1 siemens = new M1();
        siemens.brand = "Siemens";
        siemens.maxvolumeWater = 3;
        siemens.maxvolumeCoffee = 300;

        M2 philips = new M2();
        philips.brand = "Philips";
        philips.maxvolumeWater = 4;
        philips.maxvolumeCoffee = 500;

        M3 bosch = new M3();
        bosch.brand = "Bosch";
        bosch.maxvolumeWater = 5;
        bosch.maxvolumeCoffee = 600;

        siemens.Brand();
        siemens.Volume(5,4);
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != 8) {
            System.out.println("1. Показать текущий объем воды и кофе");
            System.out.println("2. Приготовить Американо");
            System.out.println("3. Приготовить Эспресо");
            System.out.println("4. Приготовить Двойной эспресо");
            System.out.println("5. Заполнить бак с водой");
            System.out.println("6. Заполнить бак с кофе");
            System.out.println("7. Иформация");
            System.out.println("8. Выключить кофкмашину");
            System.out.println("ВВедите номер меню");
            n= sc.nextInt();
            switch (n) {
                case 1:
                    siemens.Volume(5,4);
                    break;
                case 2:
                    if (5>2) {
                        System.out.println("Заполните бак с водой, Заполните бак с кофе");
                    }
                    else System.out.println( "Кофе готов");

            }

        }

        /*Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != 3) {
            System.out.println("1. Приготовить эспрессо");
            System.out.println("2. Приготовить американо");
            System.out.println("3. Выход");
            System.out.println("Введите номeр меню");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    //делаем эспрессо
                    break;
                case 2:
                    // делаем капучино
                    break;

         */


            }
        }

