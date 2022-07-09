package Lesson_02_ConditionalStatement;

import java.util.Scanner;

public class evenOrodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                // input
        // check if even or off
        int number = Integer.parseInt (scanner.nextLine());
        if(number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
