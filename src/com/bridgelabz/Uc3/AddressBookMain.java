package com.bridgelabz.Uc3;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println(" *** Welcome To ADDRESS BOOK PROGRAM *** ");
//  Calling method
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.display();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name To Edit : ");
        String firstName = scanner.next();
        addressBook.editContact(firstName);
        addressBook.display();
    }
}
