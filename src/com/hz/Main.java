package com.hz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare the input var
        int input;

        // Insantiate the printer, cards and scanner
        Printer printer = new Console();
        PostCard postcard = new PostCard(printer);
        GraduationCard graduationcard = new GraduationCard(printer);
        ChristmasCard christmascard = new ChristmasCard(printer);
        Scanner console = new Scanner(System.in);

        System.out.println("In this program you can choose from three cards");
        System.out.println("1. Press 1 for the postcard");
        System.out.println("2. Press 2 for the graduationcard");
        System.out.println("3. Press 3 for the christmas card");
        input = console.nextInt();

        // Conditional Statements to print one of the cards based on user input
        if (input == 1) {
            postcard.print();
        } else if (input == 2) {
            graduationcard.print();
        } else if (input == 3) {
            christmascard.print();
        }
    }
}
