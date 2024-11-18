package com.intellekta.staff;

public class MonthlyStaff implements Staff {
    private int workDays;
    private int premium;

    public MonthlyStaff(int workDays, int premium) {
        this.workDays = (workDays <= 0 || workDays > 30) ? 0 : workDays;
        this.premium = (premium < 0 || premium > 10000) ? 0 : premium;
    }

    public int getWorkDays() {
        return workDays;
    }

    public int getPremium() {
        return premium;
    }

    @Override
    public int calculateSalary(int salary) {
        if(salary < 0) salary = 0;
        return salary * getWorkDays() + getPremium();
    }
}