package com.example.staff;

import java.util.Scanner;

public class Person {
    private String surnameKorsun64068;
    private String firstnameKorsun64068;
    private String streetKorsun64068;
    private String zipCodeKorsun64068;
    private String cityKorsun64068;

    public void initializeKorsun64068() {
        Scanner inputKorsun64068 = new Scanner(System.in);
        System.out.print("Surname: ");
        surnameKorsun64068 = inputKorsun64068.nextLine();
        System.out.print("First name: ");
        firstnameKorsun64068 = inputKorsun64068.nextLine();
        System.out.print("Street: ");
        streetKorsun64068 = inputKorsun64068.nextLine();
        System.out.print("ZIP code: ");
        zipCodeKorsun64068 = inputKorsun64068.nextLine();
        System.out.print("City: ");
        cityKorsun64068 = inputKorsun64068.nextLine();
    }

    public void printKorsun64068() {
        System.out.println("Person: " + surnameKorsun64068 + " " + firstnameKorsun64068 + ", " + streetKorsun64068 + ", " + zipCodeKorsun64068 + ", " + cityKorsun64068);
    }
}
