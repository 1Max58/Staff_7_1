package com.example.staff;

import java.util.Scanner;

public class Staff extends Person {
    private String educationKorsun64068;
    private String positionKorsun64068;

    public void initialize1Korsun64068() {
        initializeKorsun64068();
        Scanner inputKorsun64068 = new Scanner(System.in);
        System.out.print("Education: ");
        educationKorsun64068 = inputKorsun64068.nextLine();
        System.out.print("Position: ");
        positionKorsun64068 = inputKorsun64068.nextLine();
    }

    public void print1Korsun64068() {
        printKorsun64068();
        System.out.println("Staff: " + educationKorsun64068 + ", " + positionKorsun64068);
    }
}
