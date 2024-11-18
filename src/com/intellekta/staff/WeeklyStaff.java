package com.intellekta.staff;

import java.util.Random;

public class WeeklyStaff extends MonthlyStaff {
    private int workWeeks;

    public WeeklyStaff(int workDays, int premium) {
        super(workDays, premium);
        int rd = new Random().nextInt(5) + 1;
        this.workWeeks = (rd < 2 || rd > 4) ? 0 : rd;
    }

    public int getWorkWeeks() {
        return workWeeks;
    }

    public int calculateSalary(int salary) {
        if(salary < 0) salary = 0;
        return getWorkWeeks() * salary;
    }

    void printYearSalary(int salary) {
        if(salary < 0) salary = 0;
        System.out.println(getWorkWeeks() * salary * 26);
    }
}