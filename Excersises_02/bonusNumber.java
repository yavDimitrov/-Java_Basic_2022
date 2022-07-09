<<<<<<< HEAD
package Excersises_02;

import java.util.Scanner;

public class bonusNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int num = Integer.parseInt(scan.nextLine());
        double bonus = 0.0;
        /*  Ако числото е до 100 включително, бонус точките са 5.
            Ако числото е по-голямо от 100, бонус точките са 20% от числото.
            Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
            */
        if (num <= 100) {
            bonus +=5;
        } else if ( num <= 1000) {
            bonus = num*0.2;
        } else {
            bonus = num*0.1;
        }

        /* За четно число  + 1 т.
           За число, което завършва на 5  + 2 т.
         */
        if (num % 10 == 5) {
            bonus += 2;
        } else if (num%2 == 0) {
            bonus += 1;
        }
        System.out.printf("%.01f %n",  bonus);
        System.out.printf("%.01f", num + bonus);
    }
}
=======
package Excersises_02;

import java.util.Scanner;

public class bonusNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int num = Integer.parseInt(scan.nextLine());
        double bonus = 0.0;
        /*  Ако числото е до 100 включително, бонус точките са 5.
            Ако числото е по-голямо от 100, бонус точките са 20% от числото.
            Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
            */
        if (num <= 100) {
            bonus +=5;
        } else if ( num <= 1000) {
            bonus = num*0.2;
        } else {
            bonus = num*0.1;
        }

        /* За четно число  + 1 т.
           За число, което завършва на 5  + 2 т.
         */
        if (num % 10 == 5) {
            bonus += 2;
        } else if (num%2 == 0) {
            bonus += 1;
        }
        System.out.printf("%.01f %n",  bonus);
        System.out.printf("%.01f", num + bonus);
    }
}
>>>>>>> f4f38080b57f0b473462d6a3d4a104f6cf6d0bfa
