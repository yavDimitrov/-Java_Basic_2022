package Lesson_04_Foor_Loop;

import java.util.Scanner;

public class Num_downBy_3 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int num = Integer.parseInt(scanner.nextLine());

            for (int number = 1; number <= num; number +=3) {

                System.out.println(number);
            }

        }


}
