package com.bridgelabz.Uc4;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println(" *** Welcome To ADDRESS BOOK PROGRAM *** ");
//  Calling method to Add Contact in Address Book(UC2)
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
//UC3:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name To Edit the Contact : ");
        String firstName = scanner.next();
        addressBook.editContact(firstName);
        addressBook.display();
//UC4:
        System.out.println("Enter the First Name To Delete the Contact: ");
        firstName = scanner.next();
        addressBook.deleteContact(firstName);   }
}
