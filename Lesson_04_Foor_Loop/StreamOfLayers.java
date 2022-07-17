package Lesson_04_Foor_Loop;

import java.util.Scanner;

public class StreamOfLayers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        for (int position = 0; position <= text.length() -1 ; position++) {

            char currentSymbol = text.charAt(position);
            System.out.println(currentSymbol);
        }
    }
}
