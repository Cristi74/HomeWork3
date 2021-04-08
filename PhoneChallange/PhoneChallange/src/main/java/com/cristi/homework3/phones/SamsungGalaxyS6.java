package com.cristi.homework3.phones;

public class SamsungGalaxyS6 extends Samsung{

    public SamsungGalaxyS6() {

    }

    @Override
    protected int setRemainingBattery(int consumption) {
        return this.remainingBattery = this.remainingBattery - consumption;
    }

}
