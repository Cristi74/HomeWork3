package com.cristi.homework3.phones.apple;

import com.cristi.homework3.phones.Configuration;

public class IphoneXX extends IphoneX implements Configuration {
    @Override
    public void makeCall(String phoneNumber) {
        callHistory.add(phoneNumber);
        setRemainingBattery(2);
    }

    @Override
    public void setColor() {

    }

    @Override
    public void getColor() {

    }

    @Override
    public void setMaterial() {

    }

    @Override
    public void getMaterial() {

    }
}