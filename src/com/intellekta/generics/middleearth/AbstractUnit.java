package com.intellekta.generics.middleearth;

import java.util.Random;

public abstract class AbstractUnit implements Unit {

    int power;
    private String name;
    private final int maxPower;
    private final int minPower;

    public AbstractUnit(String name, int minPower, int maxPower) { // Для юнитов
        this.name = (name.trim().matches("[a-zA-Z0-9\\s]+")) ? name : super.toString();
        this.minPower = minPower;
        this.maxPower = maxPower;
        power = new Random().nextInt(maxPower - minPower + 1) + minPower;
    }

    public AbstractUnit(int minPower, int maxPower) { // Для животных
        this.minPower = minPower;
        this.maxPower = maxPower;
        power = new Random().nextInt(maxPower - minPower + 1) + minPower;
    }

    public String getName() {
        return name;
    }

    int getPower() {
        return power;
    }

    void setPower(int power) {
        this.power = power;
    }

    public boolean isAlive() {
        return power > 0;
    }

    public <T extends AbstractUnit> void strike(T unit) {
        unit.damage(this.getPower());
    }

    public void damage(int opponentsDamage) {
        int newPowerOfTheUnit = this.getPower() - opponentsDamage;
        this.setPower(Math.max(newPowerOfTheUnit, 0));
    }

    @Override
    public String toString() {
        return String.format("\t%s %s has power %d", this.getClass().getSimpleName(), name, power);
    }
}
