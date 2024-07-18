import application.Generator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean done = false;
        int choice;

        while (!done) {
            System.out.println("PASSWORD GENERATOR");
            System.out.println(" 1. Generate a password");
            System.out.println(" 2. Exit");
            while (true) {
                try {
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    if (choice < 1 || choice > 2) {
                        System.out.println("Error: Your choice is not valid. Please try again!");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: The input was not an integer as expected.");
                    sc.next();
                }
            }

            if (choice == 1) {
                int length;
                while (true) {
                    try {
                        System.out.print("Enter password length (at least 4): ");
                        length = sc.nextInt();

                        if (length < 4) {
                            System.out.println("Error: The length was not sufficient");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: The input was not an integer as expected.");
                        sc.next();
                    }
                }

                String password = Generator.generatePassword(length);
                System.out.println("Generated password: " + password);

                sc.nextLine();
                sc.nextLine();
            } else {
                done = true;
            }
        }

        sc.close();
    }
}