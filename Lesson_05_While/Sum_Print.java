package Lesson_05_while;

import java.util.Scanner;


public class Sum_Print {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

      /*  for(int i =1; i <= number; i = i*2 +1)
            System.out.println((i)); */
        int n = 1;
        while (n <= number) {
            System.out.println(n);
            n = n * 2 + 1;
        }

    }
}
