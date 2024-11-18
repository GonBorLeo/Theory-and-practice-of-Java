package com.intellekta.generics.middleearth;

public class HumanCavalry extends AbstractCavalryUnit implements MiddleEarthUnit, Human, Cavalry{
    public HumanCavalry(String name) {
        super(name, minPower, maxPower);
    }

    public HumanCavalry(String name, int  minPower, int maxPower) {
        super(name, minPower, maxPower);
    }
}
