package Lesson_04_Foor_Loop;

import java.util.Scanner;

public class Number_N_to_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int number = num; number >= 1; number--) {

            System.out.println(number);
        }

    }
}
