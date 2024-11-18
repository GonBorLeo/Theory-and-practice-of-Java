package com.intellekta.generics.middleearth;


public abstract class AbstractCavalryUnit extends AbstractUnit implements Cavalry{
    private final Beast beast;

    public AbstractCavalryUnit(String name, int minPower, int maxPower) {
        super(name, minPower, maxPower);
        if (this instanceof MiddleEarthUnit) {
            beast = new Beast(4, 5);
        } else {
            beast = new Beast(4, 7);
        }
    }

    public class Beast extends AbstractUnit {
        public Beast(int minPower, int maxPower) {
            super(minPower, maxPower);
        }

        @Override
        public int getPower() {
            return beast.power;
        }
    }

    public Beast getBeast() {
        return beast;
    }

    public int getPower() {
        return (this.getBeast() == null) ? power : power + this.getBeast().getPower();
    }

    public void damage(int opponentsDamage) {
        if (this.getBeast() == null || this.getBeast().getPower() == 0) { // Если животного нет или оно мертво
            int newPowerOfTheUnit = this.getPower() - opponentsDamage;
            this.setPower(Math.max(newPowerOfTheUnit, 0));
        } else { // Если у животного есть/осталась power
            int newPowerOfTheBeast = this.getBeast().getPower() - opponentsDamage;
            this.getBeast().setPower(Math.max(newPowerOfTheBeast, 0));
        }
    }

    @Override
    public String toString() {
        return String.format("\t%s %s has power %d", this.getClass().getSimpleName(), getName(), getPower());
    }
}
