package com.intellekta.generics.middleearth;

public class Elf extends AbstractUnit implements MiddleEarthUnit, Infantry{
    public Elf(String name) {
        super(name, 4, 7);
    }
}
