package Lesson_04_Foor_Loop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countNum = Integer.parseInt(scan.nextLine());

        int Sum = 0;

        for (int number = 1; number <= countNum; number++) {
            int value = Integer.parseInt(scan.nextLine());
            Sum += value;
        }

        System.out.println(Sum);
    }
}
