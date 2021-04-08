package com.cristi.homework3.phones;

import java.util.LinkedList;

public class Contact {
    LinkedList<Object> messages = new LinkedList<>();
    String contactPosition = "";
    String contactPhoneNumber = "";
    String contactFirstName = "";
    String contactLastName = "";
    String contactName = "";

    String getContactPosition() {
        return contactPosition;
    }

    void setContactPosition(String contactPosition) {
        this.contactPosition = contactPosition;
    }

    String getContactPhoneNumber() {
        return this.contactPhoneNumber;
    }

    void setContactPhoneNumber(String phoneNumber) {
        this.contactPhoneNumber = phoneNumber;
    }

    void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    String getContactName() {
        return this.contactName = this.contactFirstName + " " + this.contactLastName;
    }
}

