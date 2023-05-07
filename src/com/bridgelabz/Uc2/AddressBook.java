package com.bridgelabz.Uc2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addContact() {
/*
    Creating Contacts for each person by Using Scanner method
 */
        Contact contact = new Contact();
        System.out.print("Enter the First Name : ");
        contact.setFirstName(scanner.nextLine());
        System.out.print("Enter the Last Name : ");
        contact.setLastName(scanner.nextLine());
        System.out.print("Enter the Address : ");
        contact.setAddress(scanner.nextLine());
        System.out.print("Enter the City : ");
        contact.setCity(scanner.nextLine());
        System.out.print("Enter the State : ");
        contact.setState(scanner.nextLine());
        System.out.print("Enter the Zip Code : ");
        contact.setZip(scanner.nextLine());
        System.out.print("Enter the PhoneNumber : ");
        contact.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter the Email id : ");
        contact.setEmail(scanner.nextLine());
        list.add(contact);
    }
    public void display(){
/*
    To Print the ArrayList of Contact
 */
        System.out.println(list);
        System.out.println("Contact Added Successfully");
    }

}
