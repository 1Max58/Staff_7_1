package com.example.staff;

public class Main {
    public static void main(String[] args) {
        System.out.println("The program uses inheritance process - the Staff class is inherited from the base class Person");
        Staff staffKorsun64068 = new Staff();
        System.out.println("Please enter a staff");
        staffKorsun64068.initialize1Korsun64068();
        System.out.println("You entered the data:");
        staffKorsun64068.print1Korsun64068();
        System.out.printf("Salary to pay after 2 hours of worktime with rate $5 per hour: %.2f%n", staffKorsun64068.salaryToPayKorsun64068(2, 5));
        System.out.printf("Salary to pay after 2 hours of overtime with rate $5 per hour: %.2f%n", staffKorsun64068.salaryForOvertimeKorsun64068(2, 5));
        System.out.print("Should receive bonus after 20 years of experience: " + Salary.shouldReceiveBonusKorsun64068(20));
    }
}
