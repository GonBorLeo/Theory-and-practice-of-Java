package com.intellekta.staff;

import java.util.Random;

public class HourlyStaff implements Staff {
    private int workTime;

    public HourlyStaff() {
        int rd = new Random().nextInt(9) + 3;
        this.workTime = (rd < 4 || rd > 10) ? 0 : rd;
    }

    public int getWorkTime() {
        return workTime;
    }

    @Override
    public int calculateSalary(int salary) {
        if(salary < 0) salary = 0;
        return salary * getWorkTime();
    }
}