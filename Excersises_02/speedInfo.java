package Lesson_02_ConditionalStatement;

import java.util.Scanner;

public class speedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 50) {
            System.out.println("average");
        } else if (speed <= 150) {
            System.out.println("fast");
        } else if (speed <= 100) {
            System.out.println("ultra fast");
        } else   {
            System.out.println("extremely fast");
        }

    }
}
