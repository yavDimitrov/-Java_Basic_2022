<<<<<<< HEAD
package Excersises_02;

import java.util.Scanner;

public class godzilaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*От конзолата се четат 3 реда:
            Ред 1. Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
            Ред 2. Брой на статистите – цяло число в интервала [1 … 500]
            Ред 3. Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

         */
        double budget = Double.parseDouble(scan.nextLine());
        int actors = Integer.parseInt(scan.nextLine());
        double costume = Double.parseDouble(scan.nextLine());

        double decor = budget*0.1;
        double costumeSum = actors*costume;

        if (actors > 150){
            costumeSum *=0.9;
        }

        double totalSum = decor + costumeSum;

        if(totalSum < budget) {

            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.02f leva left.", budget - totalSum);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.02f leva more.", totalSum - budget);

        }
    }
}
=======
package Excersises_02;

import java.util.Scanner;

public class godzilaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*От конзолата се четат 3 реда:
            Ред 1. Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
            Ред 2. Брой на статистите – цяло число в интервала [1 … 500]
            Ред 3. Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]

         */
        double budget = Double.parseDouble(scan.nextLine());
        int actors = Integer.parseInt(scan.nextLine());
        double costume = Double.parseDouble(scan.nextLine());

        double decor = budget*0.1;
        double costumeSum = actors*costume;

        if (actors > 150){
            costumeSum *=0.9;
        }

        double totalSum = decor + costumeSum;

        if(totalSum < budget) {

            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.02f leva left.", budget - totalSum);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.02f leva more.", totalSum - budget);

        }
    }
}
>>>>>>> f4f38080b57f0b473462d6a3d4a104f6cf6d0bfa
