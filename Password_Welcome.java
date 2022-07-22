package Lesson_05_while;
import java.util.Scanner;


public class Password_Welcome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();
        String pass = scan.nextLine();
        String inPass = scan.nextLine();

        while (!inPass.equals(pass)) {

            inPass = scan.nextLine();


        }

        System.out.println("Welcome, "+ userName + "!");
    }
}
