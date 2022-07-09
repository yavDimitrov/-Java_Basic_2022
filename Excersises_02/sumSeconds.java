package Excersises_02;

import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scan.nextLine());
        int timeSecond = Integer.parseInt(scan.nextLine());
        int timeThird = Integer.parseInt(scan.nextLine());
        int totalTime = timeFirst + timeSecond + timeThird;



        double minutes = Math.floor(totalTime/60);
        double seconds = totalTime%60;

        //System.out.println(seconds);

      //System.out.printf("%d : %02d", minutes, seconds);
      //System.out.printf("%d", minutes);
      System.out.printf("%.0f:%02.0f",minutes, seconds);

    }
}
