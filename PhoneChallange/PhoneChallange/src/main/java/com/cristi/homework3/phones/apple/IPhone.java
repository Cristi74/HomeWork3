package com.cristi.homework3.phones.apple;

import com.cristi.homework3.phones.Phone;

import java.util.LinkedList;

import static java.lang.Long.parseLong;

public abstract class IPhone extends Phone {
    public LinkedList<String> callHistory = new LinkedList<>();
    private String[] imeiUsage = {"1", "1", "1", "1"};
    public final long imei = setImei();

    private long setImei() {
        StringBuilder tempString = new StringBuilder();

        for (int i = 1; i <= 15; i++) {
            tempString.append(Math.round(Math.random() * 9));
        }
        if (this.imeiUsage[0].equals("1")) {
            this.imeiUsage[0] = tempString.toString();
        } else for (String imei : this.imeiUsage) {
            if (!imei.equals("1") && imei.equals(tempString.toString())) setImei();
            else if (imei.equals("1")) imei = tempString.toString();
        }
        return parseLong(tempString.toString());
    }

    public long getImei() {
        return imei;
    }

    public int getRemainingBattery() {
        return remainingBattery;
    }

    @Override
    public void receiveCall() {

    }

    @Override
    public void callsHistory() {
        System.out.println(this.callHistory);
    }

}
