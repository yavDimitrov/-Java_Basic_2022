package Excersises_04_For_loops;

import java.util.Scanner;

public class HalfSumElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scan.nextLine());

            sum += number;

            // maxNumber = Math.max(maxNumber, number);
            // може да се използва и израза по-горе

            if (number > maxNumber) {
                maxNumber = number;
            }


        }

        sum -= maxNumber;

        if (maxNumber == sum) {

            System.out.printf("Yes %n" +
                    "Sum = %d", maxNumber);
        } else {

            System.out.printf("No %n" +
                    "Dif = %d", Math.abs(maxNumber - sum));
        }


    }
}
