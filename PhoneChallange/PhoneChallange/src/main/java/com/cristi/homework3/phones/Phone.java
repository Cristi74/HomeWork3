package com.cristi.homework3.phones;

import java.util.ArrayList;

public class Phone {
    final int batteryLife = 100;
    public int remainingBattery = batteryLife;
    ArrayList<com.cristi.homework3.phones.Contact> contacts = new ArrayList<>();
    boolean notExist = true;

    public void addContact(String position, String phoneNumber, String firstName, String lastName) {
        Contact newContact = new Contact();

        if (isNumber(position)) {
            newContact.setContactPosition(position);
            newContact.setContactPhoneNumber(phoneNumber);
            newContact.setContactFirstName(firstName);
            newContact.setContactLastName(lastName);
            if (notExist) {
                this.contacts.add(newContact);
                notExist = false;
            } else if (!notExist) {
                for (Contact contact : this.contacts) {
                    if (contact != null && contact.getContactName().equalsIgnoreCase(firstName + " " + lastName)) {
                        if (contact.getContactPosition().equals(position)) {
                            System.out.println("Contact exist");
                            break;
                        } else notExist = true;
                    } else notExist = true;
                }
                if (notExist) {
                    this.contacts.add(newContact);
                    notExist = false;
                }
            }
        } else System.out.println("First parameter must be a string number");
    }

    public void listContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.getContactPosition());
            System.out.println(contact.getContactPhoneNumber());
            System.out.println(contact.getContactName() + "\r\n");
        }

    }

    public void removeContact() {

    }

    public void sendMessage(String phoneNumber, String message) {
        if (message.length() < 500) {
            for (Contact contact : this.contacts) {
                if (contact != null && contact.getContactPhoneNumber().equals(phoneNumber)) {
                    contact.messages.add(message);
                    break;
                }
            }
            setRemainingBattery(1);
        } else System.out.println("Message is to long");
    }

    public void deleteMessage() {

    }

    public void messagesHistory(String phoneNumber) {
        System.out.println("Yor messages to " + phoneNumber);
        for (Contact contact : contacts) {
            if (contact.getContactPhoneNumber().equals(phoneNumber))
                for (int i = 0; i < contact.messages.size(); i++) {
                    System.out.println(contact.messages.get(i));
                }
        }
    }

    public void makeCall(String phoneNumber) {

    }

    public void receiveCall() {

    }

    public void callsHistory() {
    }

    public long getImei() {
        return 0;
    }

    protected void setRemainingBattery(int consumption) {
        remainingBattery = remainingBattery - consumption;
    }

    private boolean isNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Too big or not a number.\r\n");
        }
        return false;
    }
}

