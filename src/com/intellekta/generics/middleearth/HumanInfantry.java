package com.intellekta.generics.middleearth;

public class HumanInfantry extends AbstractUnit implements MiddleEarthUnit, Human, Infantry{
    public HumanInfantry(String name) {
        super(name, minPower, maxPower);
    }
}
