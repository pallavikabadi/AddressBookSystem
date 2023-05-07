package com.bridgelabz.Uc1;

public class AddressBook {
    public void CreateContact() {
        Contact contact = new Contact();
        contact.setFirstName("Pallavi");
        contact.setLastName("Jadhav");
        contact.setAddress("Royal Oak Society");
        contact.setCity("Pune");
        contact.setState("Maharashtra");
        contact.setZip("411057");
        contact.setPhoneNumber("8745327623");
        contact.setEmail("pallavi08jadhav@gmail.com");

        System.out.println("First Name : " + contact.getFirstName());
        System.out.println("Second Name : " + contact.getLastName());
        System.out.println("Address : " + contact.getAddress());
        System.out.println("City : " + contact.getCity());
        System.out.println("State : " + contact.getState());
        System.out.println("Zip Code : " + contact.getZip());
        System.out.println("Phone Number : " + contact.getPhoneNumber());
        System.out.println("E-Mail : " + contact.getEmail());
    }
}
