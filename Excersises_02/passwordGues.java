package Lesson_02_ConditionalStatement;

import java.util.Scanner;

public class passwordGues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.equals("123456")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Wrong password");
        }
    }
}