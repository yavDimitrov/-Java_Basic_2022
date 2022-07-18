package Lesson_04_Foor_Loop;

import java.util.Scanner;

public class TextSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        //daljina na tekst
                System.out.println(text.length());
        // parvi simbol
        char firstSymbol = text.charAt(0);
                System.out.println(firstSymbol);
                // posleden simvol -> pozicia = daljina - 1
        char lastSymbol = text.charAt(text.length() - 1);

        System.out.println(lastSymbol);
    }
}
;