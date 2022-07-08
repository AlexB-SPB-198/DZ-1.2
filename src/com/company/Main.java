package com.company;

public class Main {


    public static void main(String[] args) {

        Production production = new Production("Ford", "Boston");
        ObjectA objectA = new ObjectA(1.6, 125, ColorEnum.BLACK, production);
        System.out.println("Focus " + "\n" + objectA.getInfo());
        objectA.makeVoice();

        Production production1 = new Production("Ford", "SPb");
        ObjectA objectB = new ObjectA(2.5, 150, ColorEnum.BLUE, production1);
        System.out.println("Kuga " + "\n" + objectB.getInfo());
        objectB.makeVoice("bip bip");

        ObjectA ObjectC = new ObjectA(1.5, 150, ColorEnum.WHITE);
        System.out.println("Kuga " + "\n" + ObjectC.getInfo());
        ObjectC.makeVoice();


    }
}