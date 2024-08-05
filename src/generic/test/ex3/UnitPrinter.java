package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;

public class UnitPrinter<T> {
    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        T unit = t.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> unit) {
        BioUnit out = unit.out();
        System.out.println("이름: " + out.getName() + ", HP: " + out.getHp());
    }
}
