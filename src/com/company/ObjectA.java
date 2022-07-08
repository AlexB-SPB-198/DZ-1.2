package com.company;

public class ObjectA {
    private double engineVolume;
    private int power;
    private ColorEnum colorEnum;
    private Production production;

    public ObjectA() {
    }

    public ObjectA(double engineVolume, int power, ColorEnum colorEnum, Production production) {
        this.engineVolume = engineVolume;
        this.power = power;
        this.colorEnum = colorEnum;
        this.production = production;
    }

    public ObjectA(double engineVolume, int power, ColorEnum colorEnum) {
        this.engineVolume = engineVolume;
        this.power = power;
        this.colorEnum = colorEnum;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getPower() {
        return power;
    }

    public ColorEnum getModelEnum() {
        return colorEnum;
    }

    public Production getProduction() {
        return production;
    }

    public String getInfo() {
        if (production != null) {
            return "EngineVolume: " + engineVolume +
                    "\nPower: " + power +
                    "\nColor: " + colorEnum +
                    "\nCountry: " + production.getCountry() +
                    "\nCity: " + production.getCity();
        } else {
            return "EngineVolume: " + engineVolume +
                    "\nPower: " + power +
                    "\nColor: " + colorEnum;
        }
    }
    public void makeVoice() {
        System.out.println("Biiiiii");

    }
    public void makeVoice(String voice) {
        System.out.println(voice);
    }
}
