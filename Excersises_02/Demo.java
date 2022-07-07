package Excersises_02;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scan.nextLine());
        int timeSecond = Integer.parseInt(scan.nextLine());
        int timeThird = Integer.parseInt(scan.nextLine());
        int totalTime = timeFirst + timeSecond + timeThird;


        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        //System.out.println(seconds);

        //System.out.printf("%d : %02d", minutes, seconds);
        //System.out.printf("%d", minutes);
        System.out.printf("%d:%02d", minutes, seconds);

    }
}
