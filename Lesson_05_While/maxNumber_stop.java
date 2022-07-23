package Lesson_05_while;
import java.util.Scanner;

public class maxNumber_stop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            // число под формата на текст
            //текст -> число (parse)

            int number = Integer.parseInt(scan.nextLine());
            // проверка дали е макс

            // max = Math.max(max, number);
            if (number > max) {
                max = number;
            }
            input = scan.nextLine();
        }
        System.out.println(max);
    }
}

