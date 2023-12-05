package com.example.staff;

public interface Salary {
    double salaryToPayKorsun64068(double hours, double rate);
    default double salaryForOvertimeKorsun64068(double hours, double rate) {
        return salaryToPayKorsun64068(hours, rate) * 2;
    }
    static boolean shouldReceiveBonusKorsun64068(int yearsOfExpreience) {
        return yearsOfExpreience >= 10;
    }
}
