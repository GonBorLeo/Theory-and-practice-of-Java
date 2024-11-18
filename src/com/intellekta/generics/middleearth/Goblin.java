package com.intellekta.generics.middleearth;

public class Goblin extends AbstractUnit implements MordorUnit, Infantry {
    public Goblin(String name) {
        super(name, 2, 5);
    }
}
