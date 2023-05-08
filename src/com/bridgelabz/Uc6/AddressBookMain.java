package com.bridgelabz.Uc6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain extends AddressBook {
    public static Map<String,AddressBook> addressBookMap= new HashMap<>();
    public static void addAddressBook() {
        /*
        creating new Address Book And each Address book has Unique name using Console
        */
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter the name of the new Address Book: ");
        addressBook.setAddressBookName(scanner.next());
        // Checking for the key_element 'addressBook.getAddressBookName()'
        if (addressBookMap.containsKey(addressBook.getAddressBookName())) {
            System.out.println("Address Book already exists");
            return;
        }
        //Mapping AddressBook to String keys
        addressBookMap.put(addressBook.getAddressBookName(),addressBook);
        System.out.println("Address Book Added");
        System.out.println();
        //new address book is added and contact person is added to it by using switch case
        boolean isStatus= true;
        while(isStatus){
            System.out.println("= To ADD a Contact to this Address Book: PRESS 1");
            System.out.println("= To Close this Address Book: PRESS 2");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addressBook.addContact();
                    System.out.println(addressBook);
                    System.out.println("Contact Added!!!");
                    System.out.println();
                    break;
                case 2:
                    isStatus=false;
                    break;
                default:
                    System.out.println("Enter a valid choice!!!");
            }
        }
    }
    public static void addContacts() {
        /*
        Contact person in Address Book is added to Address Book name
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the address book you want to add contact:");
        String firstName = scanner.next();
        // Checking for the key_element 'firstName'
        if(addressBookMap.containsKey(firstName)) {
            AddressBook addressBook= addressBookMap.get(firstName);
            addressBook.addContact();
            System.out.println(addressBook);
            System.out.println("Contact Added!!!");
            System.out.println();
        }
        else
            System.out.println("Given Address Book not Found!!!");
    }
    public static void editContacts(){
        /*
            Edit Contact in Address Book is added to Address Book name
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the address book, the contact you want to edit exists:");
        String firstName = scanner.next();
        // Checking for the key_element 'firstName'
        if(addressBookMap.containsKey(firstName)) {
            AddressBook addressBook= addressBookMap.get(firstName);
            System.out.print("Enter the First Name To Edit the Contact : ");
            addressBook.editContact(scanner.next());
        }
        else
            System.out.println("Given Address Book not Found!!!");
    }

    public static void deleteContacts(){
        /*
           Delete Contact in Address Book is added to Address Book name
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the address book, the contact you want to Delete exists:");
        String firstName= scanner.next();
        // Checking for the key_element 'firstName'
        if(addressBookMap.containsKey(firstName)) {
            AddressBook addressBook= addressBookMap.get(firstName);
            System.out.println("Enter the First Name To Delete the Contact : ");
            addressBook.deleteContact(scanner.next());
        }
        else
            System.out.println("Given Address Book not Found!!!");
    }
    public static void displayAddressBook(){
    /*
       Display Contact in Address Book is added to Address Book name
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the address book you want to Display:");
        String firstName = scanner.next();
        // Checking for the key_element 'firstName'
        if(addressBookMap.containsKey(firstName)) {
            AddressBook addressBook = addressBookMap.get(firstName);
            System.out.println(addressBook);
        }
        else
            System.out.println("Given Address Book not Found!!!");
    }
    public static void main(String[] args) {
        /*
         * Calling Methods by using Switch Case
         */
        System.out.println(" Welcome To ADDRESS BOOK PROGRAM ");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("---Address Book---");
            System.out.println("1. Add AddressBook \n2. Add Contact \n3. Edit Contact \n4. Delete Contact \n5. Display Contact \n");
            System.out.println("Choose any Number : ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addAddressBook();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    editContacts();

                    break;
                case 4:
                    deleteContacts();
                    break;
                case 5:
                    displayAddressBook();
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}
