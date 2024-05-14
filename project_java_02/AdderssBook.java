package project_java_02;

import java.util.ArrayList;
import java.util.Scanner;

public class AdderssBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> adderssBook = new ArrayList<>();

        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter company: ");
                    String company = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();

                Contact newContact = new Contact(name, company, email, phone);
                adderssBook.add(newContact);
                System.out.println("Contact added successfully!");
                break;
                case 2:
                    System.out.println("Enter name to find: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (Contact contact : adderssBook) {
                        if (contact.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Phone number: " +contact.getPhone());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Not found");
                    }
                    break;
//                case 3:
//                    System.out.println("Address Book: ");
//                    for(Contact contact : adderssBook) {
//                        System.out.println("Name: " + contact.getName());
//                        System.out.println("Company: " + contact.getCompany());
//                        System.out.println("Email: " + contact.getEmail());
//                        System.out.println("Phone: " + contact.getPhone());
//                        System.out.println();
//                    }
//                    break;
                case 3:
                    System.out.println("Address Book:");
                    System.out.printf("%-20s  %-20s  %-20s  %-20s%n", "Name", "Company", "Email", "Phone");
                    for (Contact contact : adderssBook) {
                        System.out.printf("%-20s  %-20s  %-20s  %-20s%n",
                                contact.getName(), contact.getCompany(), contact.getEmail(), contact.getPhone());
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        }
    }
}
