package Excersises_04_For_loops;

import java.util.Scanner;

import static java.awt.SystemColor.text;

public class redWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {

            char symbol = text.charAt(i);

            if (symbol == 'a') {
                sum += 1;
            }
            if (symbol == 'e') {
                sum += 2;
            }
            if (symbol == 'i') {
                sum += 3;
            }
            if (symbol == 'o') {
                sum += 4;
            }
            if (symbol == 'u') {
                sum += 5;
            }


        }
        System.out.println(sum);
    }
}
