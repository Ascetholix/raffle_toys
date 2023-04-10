import toys.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import static toys.Toys.getCount;

public class Main {
    static ArrayList arrayList = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        Scanner iScanner = new Scanner(System.in);

//        System.out.printf("Привет, %s!", name);
//        iScanner.close();
//        FileWriter fileWriter = new FileWriter("toys_log.txt");
//        fileWriter.flush();
        arrayList.addAll(CreateToys());
//        int count = 3;
        while (true){
            String name = iScanner.nextLine();
            System.out.println(arrayList);
            System.out.println(arrayList.size());
            System.out.println(getCount());
        }

    }
    public static ArrayList<Toys> CreateToys() {
        ArrayList<Toys> arrayList = new ArrayList<>();
        Integer numberOfSoldiers;
        Integer numberOfBears;
        Integer numberOfBarbies;
        while (true) {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите количество игрушек");
            System.out.printf("Солдатики: ");
            numberOfSoldiers = Integer.parseInt(iScanner.nextLine());
            System.out.printf("Медвежонок: ");
            numberOfBears = Integer.parseInt(iScanner.nextLine());
            System.out.printf("Барби: ");
            numberOfBarbies = Integer.parseInt(iScanner.nextLine());
            break;
        }
        Soldier soldier = new Soldier(getCount());
        arrayList.add(soldier);
        for (int i = 0; i < numberOfSoldiers-1; i++) {
            soldier = new Soldier(getCount());
            arrayList.add(soldier);
        }
        Bear bear = new Bear(getCount());
        arrayList.add(bear);
        for (int i = 0; i < numberOfBears-1; i++) {
            bear = new Bear(getCount());
            arrayList.add(bear);
        }
        Barbie barbie = new Barbie(getCount());
        arrayList.add(barbie);
        for (int i = 0; i < numberOfBarbies-1; i++) {
            barbie = new Barbie(getCount());
            arrayList.add(barbie);
        }
        return arrayList;
    }

}
