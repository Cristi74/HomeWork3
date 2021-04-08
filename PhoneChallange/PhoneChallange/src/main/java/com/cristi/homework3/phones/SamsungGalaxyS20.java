package com.cristi.homework3.phones;

public class SamsungGalaxyS20 extends Samsung implements Configuration {
    public static String color = "";
    final int batteryLife = 120;
    int remainingBattery = this.batteryLife;

    @Override
    protected void setRemainingBattery(int consumption) {
        this.remainingBattery = this.remainingBattery - consumption;
    }

    @Override
    public int getRemainingBattery() {
        return this.remainingBattery;
    }

    @Override
    public void setColor() {
        color = color.concat("Red");
    }

    @Override
    public void getColor() {
        System.out.println(color + "is my color");
    }

    @Override
    public void setMaterial() {

    }

    @Override
    public void getMaterial() {

    }
}
