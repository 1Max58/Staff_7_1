package com.example.staff;

public interface Salary {
    public double salaryToPayKorsun64068(double hours, double rate);
    public default double salaryForOvertimeKorsun64068(double hours, double rate) {
        return salaryToPayKorsun64068(hours, rate) * 2;
    }
    public static boolean shouldReceiveBonusKorsun64068(int yearsOfExpreience) {
        return yearsOfExpreience >= 10;
    }
}
