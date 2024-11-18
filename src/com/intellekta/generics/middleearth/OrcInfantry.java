package com.intellekta.generics.middleearth;

public class OrcInfantry extends AbstractUnit implements MordorUnit, Orc, Infantry{

    public OrcInfantry(String name, int minPower, int maxPower) {
        super(name, minPower, maxPower);
    }
    public OrcInfantry(String name) {
        super(name, minPower, maxPower);
    }
}
