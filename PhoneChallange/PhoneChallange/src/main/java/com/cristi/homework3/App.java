package com.cristi.homework3;

import com.cristi.homework3.phones.Phone;
import com.cristi.homework3.phones.SamsungGalaxyS6;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args )
    {
        SamsungGalaxyS6 phone = new SamsungGalaxyS6();
        SamsungGalaxyS6 phone1 = new SamsungGalaxyS6();

        System.out.println( "Phones challenge" );
        System.out.println(phone.getImei());
        System.out.println(phone1.getImei());
        phone.addContact("1", "0745387675", "gigi", "becali");
        phone1.addContact("1", "0745387678", "gigi", "becali");
        phone.addContact("1", "0745387677", "gigicuta", "becali");
        phone1.addContact("1", "0745387677", "gigicuta", "becali");
        phone.sendMessage("0745387679", "Hello Gigi");
        System.out.println( "Yours contacts for phone" );
        phone.listContacts();
        phone.sendMessage("0745387679", "Hello Gigicuta");
        phone.sendMessage("0745387678", "Hello Gigantic");
        System.out.println( "Yours contacts for phone1" );
        phone1.listContacts();

        phone1.messagesHistory("0745387679");
        phone1.messagesHistory("0745387678");
        phone.makeCall("0745387679");
        System.out.println(phone1.getRemainingBattery());
        System.out.println(phone.getRemainingBattery());
//        System.out.println(phone.getContactName());
    }
}
