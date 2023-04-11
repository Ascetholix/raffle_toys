import toys.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import static toys.Toys.getCount;

public class Main {
    static ArrayList arrayList = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        arrayList.addAll(CreateToys());
        String choiceToys = ChoiceToys();
        int count = 0;
        while (count != 2){

            System.out.println("Список игрушок:");
            System.out.println(arrayList);
            int winningNumber = rnd.nextInt(1,getCount());
            System.out.printf("Выпало игрушка под номером %d\n",winningNumber);
            if (Winning(arrayList,choiceToys,winningNumber)){
                arrayList.remove(winningNumber);
                System.out.println("Осталось игрушок");
                System.out.println(arrayList);
                break;
            }
            System.out.println("Повторите");
            System.out.printf("У вас %d хода\n", 2-count);
            scanner.nextLine();
            count++;
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

    public static String ChoiceToys(){
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите пожалуйста призовую игрушку:");
            System.out.println("1 - Солдатик\n" +
                    "2 - Медвежонок\n" +
                    "3 - Барби\n");
            int numberOfToys = Integer.parseInt(iScanner.nextLine());
            switch (numberOfToys) {
                case 1:
                    return "Солдатик";
                case 2:
                    return "Медвежонок";
                case 3:
                    return "Барби";
            }
        }
    }
    public static boolean Winning(ArrayList<Toys> arrayList, String choice, int number){
        if(arrayList.get(number).toString().equals(choice)) {
            System.out.printf("Ура!!! Вы виграли: %s\n", choice);
            return true;
        }
        else {
            System.out.println("Вы проиграли");
            return false;
        }
    }
}
