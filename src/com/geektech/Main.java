package com.geektech;

public class Main {

    private static Object Warrior;
    private static Object Magic;
    private static Object Medic;

    public static void main(String[] args) {
        // write your code here
        Hero Rayden = new Hero() {

            @Override
            public void Hero() {

            }

            @Override
            public void applySuperAbility() {

            }

            @Override
            public String superAbilitiType() {
                return null;
            }


        };


        Medic Eren = new Medic();
//        Eren.SuperAbilitiType();
        System.out.println("Медик изпользовал суперспособность");


        Magic dumbledore = new Magic();
//        dumbledore.SuperAbilitiType();
        System.out.println("Дамблдор изпользовал суперспобность");


        Warrior Kasem = new Warrior();
//        Kasem.SuperAbilitiType();
        System.out.println("Warroir изпользовал суперспосбоность");


        Hero[] Heroes = {(Hero) Magic, (Hero) Warrior, (Hero) Medic};
        for (int i = 0; i < Heroes.length; i++) {
            System.out.println("Все изпользовали суперспособноти");
            Heroes[i].applySuperAbility();
            Heroes[i].superAbilitiType();

        }
    }

}