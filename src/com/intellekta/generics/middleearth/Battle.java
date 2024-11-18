package com.intellekta.generics.middleearth;

import java.util.List;
import java.util.Random;

public class Battle {

    public static void main(String[] args) {
        fight();
    }

    public static void fight() {
        Random random = new Random();

        Army<MiddleEarthUnit> middleEarthArmy = new Army<>();
        boolean wizardIsAvailable = random.nextBoolean();
        int middleEarthArmySize;

        Army<MordorUnit> mordorArmy = new Army<>();
        int mordorArmySize;

        do { // получение случайных размеров армий
            middleEarthArmySize = random.nextInt(26);
            mordorArmySize = random.nextInt(26);
        } while (((double) Math.max(middleEarthArmySize, mordorArmySize) / (double) Math.min(middleEarthArmySize, mordorArmySize)) >= 1.2);

        for (int i = 0; i < middleEarthArmySize; i++) {
            if (wizardIsAvailable) {
                middleEarthArmy.recruit(new Wizard("Wizard" + random.nextInt(100)));
                wizardIsAvailable = false;
            }
            switch (random.nextInt(6)) {
                case (0):
                    middleEarthArmy.recruit(new HumanInfantry("HumanInfantry" + random.nextInt(100)));
                    break;
                case (1):
                    middleEarthArmy.recruit(new HumanCavalry("HumanCavalry" + random.nextInt(100)));
                    break;
                case (2):
                    middleEarthArmy.recruit(new Elf("Elf" + random.nextInt(100)));
                    break;
                case (4):
                    middleEarthArmy.recruit(new Rohhirim("Rohhirim" + random.nextInt(100)));
                    break;
                case (5):
                    middleEarthArmy.recruit(new WoodenElf("WoodenElf" + random.nextInt(100)));
                    break;
            }
        } // Заполнение армии Средиземья

        for (int i = 0; i < mordorArmySize; i++) {
            switch (random.nextInt(6)) {
                case (0):
                    mordorArmy.recruit(new OrcInfantry("OrcInfantry" + random.nextInt(100)));
                    break;
                case (1):
                    mordorArmy.recruit(new OrcCavalry("OrcCavalry" + random.nextInt(100)));
                    break;
                case (2):
                    mordorArmy.recruit(new UrukHai("UrukHai" + random.nextInt(100)));
                    break;
                case (4):
                    mordorArmy.recruit(new Troll("Troll" + random.nextInt(100)));
                    break;
                case (5):
                    mordorArmy.recruit(new Goblin("Goblin" + random.nextInt(100)));
                    break;
            }
        }  // Заполнение армии Мордора

        fight(mordorArmy, middleEarthArmy);
    }

    public static void fight(Army<MordorUnit> mordorArmy, Army<MiddleEarthUnit> middleEarthArmy) {

        System.out.println("Army of MiddleEarthUnit consists of:");
        middleEarthArmy.print();
        System.out.println("Army of MordorUnit consists of:");
        mordorArmy.print();

        System.out.println("Phase 1:");
        System.out.println("MiddleEarthArmyCavalryListSize = " + middleEarthArmy.getCavalryList().size());
        System.out.println("MordorArmyCavalryListSize = " + mordorArmy.getCavalryList().size());
        battleOfArmies(middleEarthArmy, mordorArmy, 1);
        System.out.println("MiddleEarthArmyCavalryListSize = " + middleEarthArmy.getCavalryList().size());
        System.out.println("MordorArmyCavalryListSize = " + mordorArmy.getCavalryList().size());
        printSurvivingAndWinningUnits(mordorArmy.getCavalryList(), middleEarthArmy.getCavalryList(), 1);

        System.out.println();

        System.out.println("Phase 2:");
        System.out.println("MiddleEarthArmyInfantryListSize = " + middleEarthArmy.getInfantryList().size());
        System.out.println("MordorArmyInfantryListSize = " + mordorArmy.getInfantryList().size());
        battleOfArmies(middleEarthArmy, mordorArmy, 2);
        System.out.println("MiddleEarthArmyInfantryListSize = " + middleEarthArmy.getInfantryList().size());
        System.out.println("MordorArmyInfantryListSize = " + mordorArmy.getInfantryList().size());
        printSurvivingAndWinningUnits(mordorArmy.getInfantryList(), middleEarthArmy.getInfantryList(), 2);

        System.out.println();

        if (!mordorArmy.getArmyList().isEmpty() & !middleEarthArmy.getArmyList().isEmpty()) { // Если после двух фаз сражений в обеих армиях остались юниты
            System.out.println("Phase 3:");
            System.out.println("MiddleEarthArmyListSize = " + middleEarthArmy.getArmyList().size());
            System.out.println("MordorArmyListSize = " + mordorArmy.getArmyList().size());
            battleOfArmies(middleEarthArmy, mordorArmy, 3);
            System.out.println("MiddleEarthArmyListSize = " + middleEarthArmy.getArmyList().size());
            System.out.println("MordorArmyListSize = " + mordorArmy.getArmyList().size());

            System.out.println();
        }

        boolean middleEarthArmyWinner = mordorArmy.getArmyList().isEmpty();
        boolean mordorArmyWinner = middleEarthArmy.getArmyList().isEmpty();

        if (middleEarthArmyWinner & !mordorArmyWinner) { // проверка кто победил
            System.out.println("Army of MiddleEarthUnit has won the battle. The winners list:");
            middleEarthArmy.print();
        }
        if (mordorArmyWinner & !middleEarthArmyWinner) {
            System.out.println("Army of MordorUnit has won the battle. The winners list:");
            mordorArmy.print();
        }
    }

    private static <T extends AbstractUnit & MordorOrMiddleEarthUnit> void battleOfArmies(Army<MiddleEarthUnit> middleEarthArmy, Army<MordorUnit> mordorArmy, int phase) {
        T MEU;
        T MU;

        while (!((phase == 1) ? middleEarthArmy.getCavalryList() : (phase == 2) ? middleEarthArmy.getInfantryList() : middleEarthArmy.getArmyList()).isEmpty() &
                !((phase == 1) ? mordorArmy.getCavalryList() : (phase == 2) ? mordorArmy.getInfantryList() : mordorArmy.getArmyList()).isEmpty()) {

            if (phase == 1) {
                MEU = (T) middleEarthArmy.getRandomUnit(new HumanCavalry("randomMiddleEarthUnit"));
                MU = (T) mordorArmy.getRandomUnit(new OrcCavalry("randomMordorUnit"));
            } else if (phase == 2) {
                MEU = (T) middleEarthArmy.getRandomUnit(new HumanInfantry("randomMiddleEarthUnit"));
                MU = (T) mordorArmy.getRandomUnit(new OrcInfantry("randomMordorUnit"));
            } else {
                MEU = (T) middleEarthArmy.getRandomUnit();
                MU = (T) mordorArmy.getRandomUnit();
            }

            if (phase == 3) { // В третьей фазе кавалерия имеет преимущество первого удара перед пехотой (т. е. в дуэли, в которой участвует кавалерист и пехотинец, первый удар всегда наносит кавалерист).
                if (MEU instanceof Cavalry & MU instanceof Infantry) { // Если в дуели столкнулась кавалерия Средиземья и пехота Мордора
                    MEUattacksMU(middleEarthArmy, mordorArmy, MEU, MU);
                } else if (MU instanceof Cavalry & MEU instanceof Infantry) { // Если в дуели столкнулась кавалерия Мордора и пехота Средиземья
                    MUattacksMEU(middleEarthArmy, mordorArmy, MU, MEU);
                } else { // В других случаях (пехота vs пехота или кавалерия vs кавалерия)
                    if (new Random().nextBoolean()) { // Случайно выбираем кто атакует. Атакует юнит Средиземья
                        MEUattacksMU(middleEarthArmy, mordorArmy, MEU, MU);
                    } else { // атакует юнит Мордора
                        MUattacksMEU(middleEarthArmy, mordorArmy, MU, MEU);
                    }
                }
            } else {
                if (new Random().nextBoolean()) { // Случайно выбираем кто атакует. Атакует юнит Средиземья
                    MEUattacksMU(middleEarthArmy, mordorArmy, MEU, MU);
                } else {
                    MUattacksMEU(middleEarthArmy, mordorArmy, MU, MEU);
                }
            }


        }
    }

    private static <T extends AbstractUnit & MordorOrMiddleEarthUnit> void MUattacksMEU(Army<MiddleEarthUnit> middleEarthArmy, Army<MordorUnit> mordorArmy, T MU, T MEU) {
        MU.strike(MEU); // атака кавалерии Мордора
        printStrikeResultMUvsMEU(MEU, MU, MEU.isAlive()); // выводим результат атаки
        if (MEU.isAlive()) { // если пехота Средиземья жива
            MEU.strike(MU); // пехота Средиземья атакует кавалерию Мордора в ответ
            printStrikeResultMEUvsMU(MEU, MU, MU.isAlive()); // выводим результат атаки
            if (!MU.isAlive()) {
                mordorArmy.release(MU);
            }
        } else {
            middleEarthArmy.release(MEU);
        }
    }

    private static <T extends AbstractUnit & MordorOrMiddleEarthUnit> void MEUattacksMU(Army<MiddleEarthUnit> middleEarthArmy, Army<MordorUnit> mordorArmy, T MEU, T MU) {
        MEU.strike(MU); // атака
        printStrikeResultMEUvsMU(MEU, MU, MU.isAlive()); // выводим результат атаки
        if (MU.isAlive()) { // если юнит Мордора жив
            MU.strike(MEU); // юнит Мордора атакует юнита Средиземья в ответ
            printStrikeResultMUvsMEU(MEU, MU, MEU.isAlive()); // выводим результат атаки
            if (!MEU.isAlive()) {
                middleEarthArmy.release(MEU);
            }
        } else {
            mordorArmy.release(MU);
        }
    }

    private static void printSurvivingAndWinningUnits(List<? extends Unit> mordorUnitsList, List<? extends Unit> middleEarthUnitsList, int phase) {
        if (mordorUnitsList.isEmpty()) {
            System.out.println("Army of MiddleEarthUnit has won the " + phase + " phase. The winners list:");
            for (Unit unit : middleEarthUnitsList) {
                System.out.println(unit);
            }
        } else {
            System.out.println("Army of MordorUnit has won the " + phase + " phase. The winners list:");
            for (Unit unit : mordorUnitsList) {
                System.out.println(unit);
            }
        }
    }

    private static void printStrikeResultMEUvsMU(AbstractUnit MEU, AbstractUnit MU, boolean alive) {
        System.out.printf("\t%s %s has power %d strikes %s %s has power %d and %s\n",
                MEU.getClass().getInterfaces()[0].getSimpleName(), MEU.getName(), MEU.getPower(),
                MU.getClass().getInterfaces()[0].getSimpleName(), MU.getName(), MU.getPower(),
                (alive) ? "does not kill him" : "kills him");
    }

    private static void printStrikeResultMUvsMEU(AbstractUnit MEU, AbstractUnit MU, boolean alive) {
        System.out.printf("\t%s %s has power %d strikes %s %s has power %d and %s\n",
                MU.getClass().getInterfaces()[0].getSimpleName(), MU.getName(), MU.getPower(),
                MEU.getClass().getInterfaces()[0].getSimpleName(), MEU.getName(), MEU.getPower(),
                (alive) ? "does not kill him" : "kills him");
    }

    public static String giveRandomString() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int strLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(strLength);
        for (int i = 0; i < strLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }
}