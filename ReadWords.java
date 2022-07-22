package Lesson_05_while;
import java.util.Scanner;

public class ReadWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String text = scan.nextLine();

        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scan.nextLine();
        }
    }
}
