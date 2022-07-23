package Lesson_05_while;
import java.util.Scanner;


public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum < number) {
            int add = Integer.parseInt(scan.nextLine());
            sum += add;
        }
        System.out.println(sum);

    }
}
