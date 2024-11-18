package com.intellekta.generics.middleearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Army<T extends MordorOrMiddleEarthUnit> {
    List<Cavalry> cavalryList = new ArrayList<>();
    List<Infantry> infantryList = new ArrayList<>();
    List<Unit> armyList = new ArrayList<>();

    public List<Cavalry> getCavalryList() {
        return cavalryList;
    }

    public List<Infantry> getInfantryList() {
        return infantryList;
    }

    public List<Unit> getArmyList() {
        if (armyList.size() != cavalryList.size() + infantryList.size()) {
            armyList.clear();
            armyList.addAll(cavalryList);
            armyList.addAll(infantryList);
        }
        return armyList;
    }

    public boolean recruit(T unit) {
        if (unit instanceof Cavalry) {
            cavalryList.add((Cavalry) unit);
            getArmyList();
            return true;
        } else if (unit instanceof Infantry) {
            infantryList.add((Infantry) unit);
            getArmyList();
            return true;
        } else
            return false;
    }

    public void print() {
        for (Cavalry cavalry : cavalryList) {
            System.out.println(cavalry);
        }
        for (Infantry infantry : infantryList) {
            System.out.println(infantry);
        }
        System.out.println();
    }

    public boolean release(MordorOrMiddleEarthUnit unit) {
        if (unit instanceof Cavalry) {
            cavalryList.remove((Cavalry) unit);
            getArmyList();
            return true;
        } else if (unit instanceof Infantry) {
            infantryList.remove((Infantry) unit);
            getArmyList();
            return true;
        } else
            return false;
    }

    public Unit getRandomUnit() {
        try {
            return armyList.get(new Random().nextInt(armyList.size()));
        } catch (Exception e) {
            return null;
        }
    }

    public Unit getRandomUnit(MordorOrMiddleEarthUnit unit) {
        Random randomUnit = new Random();
        try {
            return (unit instanceof Cavalry) ?
                    cavalryList.get(randomUnit.nextInt(cavalryList.size())) :
                    infantryList.get(randomUnit.nextInt(infantryList.size()));
        } catch (Exception e) {
            return null;
        }
    }
}
