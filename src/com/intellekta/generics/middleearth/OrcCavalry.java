package com.intellekta.generics.middleearth;

public class OrcCavalry extends AbstractCavalryUnit implements MordorUnit ,Orc, Cavalry{
    public OrcCavalry(String name) {
        super(name, minPower, maxPower);
    }
}
