import toys.*;

import static toys.Toys.getCount;

public class Main {
    public static void main(String[] args) {

        Soldier soldier = new Soldier(getCount());
        System.out.println(soldier.getName());
        System.out.println(getCount());
    }
}
