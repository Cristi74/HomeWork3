package com.cristi.homework3;

import com.cristi.homework3.phones.SamsungGalaxyS20;
import com.cristi.homework3.phones.SamsungGalaxyS6;
import com.cristi.homework3.phones.apple.IphoneX;
import com.cristi.homework3.phones.apple.IphoneXX;

/**
 * Java OOP
 * NOTE:
 * Homework must be posted on GitHub and the commit id should be submitted.
 * <p>
 * Requirements
 * <p>
 * All phones offer the following behavior:
 * - you can create new contacts
 * - you can see existing contacts
 * - you can send a text message
 * - you can see all messages for a specific contact
 * - you can make a call
 * - you can see all calls history
 * <p>
 * <p>
 * Implement a phone hierarchy where:
 * - A phone can be of certain manufacters and it can have a specific model (Phone - Samsung - SamsungGalaxyS6)
 * - properties wich cannot change: battery life (in number of hours)
 * - properties that are configurable: color, material
 * - properties that are instance specific: imei
 * <p>
 * Behavior:
 * - a message can have maximum 500 chars
 * - every time a message is send an hour is taken from the battery life
 * - every time a call is made two hours are taken from the battery life
 * <p>
 * API:
 * Phone phone= new Samsung(); // shouldn't compile
 * Phone phone = new SamsungGalaxy6();
 * <p>
 * phone.addContact("1", "phone number", "fist name", "last name");
 * phone.addContact("2", "phone number", "fist name", "last name");
 * phone.listContacts();
 * <p>
 * // send a message to the first contact from the previous listed
 * // max number of characters - 100
 * phone.sendMessage("phone number", "message content");
 * phone.listMessages("phone number");
 * <p>
 * // send a message to the second contact from the previous listed
 * phone.call("phone number");
 * phone.viewHistory();
 * <p>
 * Tasks:
 * - implement the classes, abstract classes and interfaces according to the given information
 * - create at least 2 phone brands with 2 models for each
 * - create 2 new contacts
 * - send a message to the first contact
 * - make a call to the second contact
 */

public class App {
    public static void main(String[] args) {
        SamsungGalaxyS6 phone = new SamsungGalaxyS6();
        SamsungGalaxyS20 phone1 = new SamsungGalaxyS20();
        IphoneX phone2 = new IphoneX();
        IphoneXX phone3 = new IphoneXX();

        System.out.println("Phones challenge \r\n");
        System.out.println("First phone  \r\n");
        phone.addContact("1", "0745387675", "Gigi", "Bengali");
        phone.addContact("1", "0741387676", "Gig", "Panel");
        phone.sendMessage("0745387675", "toArray(T[] a)\n" +
                "Returns an array containing all of the elements in this list in proper sequence (from first to last element);" +
                " the runtime type of the returned array is that of the specified array.");
        phone.makeCall("0741387676");

        System.out.println("Second phone  \r\n");
        phone1.addContact("1", "0745387675", "Gigi", "Bengali");
        phone1.addContact("1", "0741387676", "Gig", "Panel");
        phone1.sendMessage("0745387675", "toArray(T[] a)\n" +
                "Returns an array containing all of the elements in this list in proper sequence (from first to last element);" +
                " the runtime type of the returned array is that of the specified array.");
        phone1.makeCall("0741387676");

        System.out.println("Third phone  \r\n");
        phone2.addContact("1", "0745387675", "Gigi", "Bengali");
        phone2.addContact("1", "0741387676", "Gig", "Panel");
        phone2.sendMessage("0745387675", "toArray(T[] a)\n" +
                "Returns an array containing all of the elements in this list in proper sequence (from first to last element);" +
                " the runtime type of the returned array is that of the specified array.");
        phone2.makeCall("0741387676");

        System.out.println("Forth phone  \r\n");
        phone3.addContact("1", "0745387675", "Gigi", "Bengali");
        phone3.addContact("1", "0741387676", "Gig", "Panel");
        phone3.sendMessage("0745387675", "toArray(T[] a)\n" +
                "Returns an array containing all of the elements in this list in proper sequence (from first to last element);" +
                " the runtime type of the returned array is that of the specified array.");
        phone3.makeCall("0741387676");

        phone.listContacts();
        phone1.callsHistory();
        phone2.messagesHistory("0745387675");
        System.out.println(phone3.getImei());
        System.out.println(phone1.getRemainingBattery());
    }
}
