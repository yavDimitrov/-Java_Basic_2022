<<<<<<< HEAD
package Excersises_02;

import java.util.Scanner;

public class Time_add_15min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        int calc_min = min + hour*60 + 15;

        double hour_n = Math.floor(calc_min/60);
        int min_n = calc_min%60;

        if(hour_n >= 24) {
            hour_n = hour_n%24;
        }

        System.out.printf("%.0f:%02d", hour_n, min_n);


    }

    }
=======
package Excersises_02;

import java.util.Scanner;

public class Time_add_15min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        int calc_min = min + hour*60 + 15;

        double hour_n = Math.floor(calc_min/60);
        int min_n = calc_min%60;

        if(hour_n >= 24) {
            hour_n = hour_n%24;
        }

        System.out.printf("%.0f:%02d", hour_n, min_n);


    }

    }
>>>>>>> f4f38080b57f0b473462d6a3d4a104f6cf6d0bfa
