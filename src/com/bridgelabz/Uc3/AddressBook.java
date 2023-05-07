package com.bridgelabz.Uc3;

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
    public void editContact(String searchFirstName) {

        for (Contact contact : list) {
            String firstName = contact.getFirstName();
            if (firstName.equals(searchFirstName)) {
                System.out.println("Contact Details of "+searchFirstName+" :-");
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City \n5. State \n6. Zip Code \n7. Phone Number \n8. Email Id \n");
                System.out.println("Enter your Choice which you want to Edit :- ");
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Update the First Name :");
                        String updatedFirstName = scanner.next();
                        contact.setFirstName(updatedFirstName);
                        System.out.println("First Name is UPDATED");
                        break;
                    case 2:
                        System.out.println("Update the Last Name :");
                        String updatedLastName = scanner.next();
                        contact.setLastName(updatedLastName);
                        System.out.println("Last Name is UPDATED");
                        break;
                    case 3:
                        System.out.println("Update the Address :");
                        String updatedAddress = scanner.next();
                        contact.setAddress(updatedAddress);
                        System.out.println("Address is UPDATED");
                        break;
                    case 4:
                        System.out.println("Update the City :");
                        String updatedCity = scanner.next();
                        contact.setCity(updatedCity);
                        System.out.println("City is UPDATED");
                        break;
                    case 5:
                        System.out.println("Update the State :");
                        String updatedState = scanner.next();
                        contact.setState(updatedState);
                        System.out.println("State is UPDATED");
                        break;
                    case 6:
                        System.out.println("Update the Zip :");
                        String updatedZip = scanner.next();
                        contact.setZip(updatedZip);
                        System.out.println("Zip Code is UPDATED");
                        break;
                    case 7:
                        System.out.println("Update the Phone Number :");
                        String updatedPhoneNumber = scanner.next();
                        contact.setPhoneNumber(updatedPhoneNumber);
                        System.out.println("Phone Number is UPDATED");
                        break;
                    case 8:
                        System.out.println("Update the Email Id :");
                        String updatedEmailId = scanner.next();
                        contact.setEmail(updatedEmailId);
                        System.out.println("Email Id is UPDATED");
                        break;
                    default:
                        System.out.println("INVALID CHOICE");
                }
            }
            else
                System.out.println("NO RECORD FOUND !");
        }
    }


    public void display(){
/*
    To Print the ArrayList of Contact
 */
        System.out.println(list);
        System.out.println("Contact Added Successfully");
    }

}
