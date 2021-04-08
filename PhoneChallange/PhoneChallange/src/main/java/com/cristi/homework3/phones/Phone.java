package com.cristi.homework3.phones;

import java.util.ArrayList;

public class Phone {
    ArrayList<Contact> contacts = new ArrayList<>();
    boolean notExist = false;
    final int batteryLife = 100;
    int remainingBattery = batteryLife;

    public void addContact(String position, String phoneNumber, String firstName, String lastName) {
        Contact newContact = new Contact();

        if (isNumber(position)) {
            newContact.setContactPosition(position);
            newContact.setContactPhoneNumber(phoneNumber);
            newContact.setContactFirstName(firstName);
            newContact.setContactLastName(lastName);
            if (this.contacts.size() == 0)
                this.contacts.add(newContact);
            else if (!notExist)
                for (Contact contact : this.contacts) {
                    if (contact != null && contact.getContactName().equalsIgnoreCase(newContact.getContactName()) &&
                            !contact.getContactPosition().equalsIgnoreCase(position)) {
                        notExist = true;
                        System.out.println("Contact exist.");
                        return;
                    }
                }
            if(notExist) this.contacts.add(newContact);
        } else System.out.println("First parameter must be a string number");
    }

    public ArrayList<Contact> getContacts () {
        return this.contacts;
    }

    public void listContacts() {
        for (Contact contact : this.contacts) {
            System.out.println(contact.getContactPosition());
            System.out.println(contact.getContactPhoneNumber());
            System.out.println(contact.getContactName());
        }

    }

    public void removeContact() {

    }

    public void sendMessage(String phoneNumber, String message) {
        for (Contact contact : this.contacts) {
            if (contact != null && contact.getContactPhoneNumber().equals(phoneNumber)) {
                contact.messages.add(message);
                return;
            }
        }
        setRemainingBattery(1);
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

    protected int setRemainingBattery(int consumption) {
        return this.remainingBattery = this.remainingBattery - consumption;
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

