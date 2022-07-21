package Excersises_04_For_loops;

import java.util.Scanner;

public class tennisRankList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tournaments = Integer.parseInt(scan.nextLine());
        int inPoints = Integer.parseInt(scan.nextLine());
        int points = 0;
        int wins = 0;

        for (int i = 0; i < tournaments; i++) {
            String result = scan.nextLine();
            switch (result) {
                case "W":
                    points += 2000;
                    wins++;
                    break;

                case "F":
                    points += 1200;
                    break;

                case "SF":
                    points += 720;
                    break;

            }

        }
        System.out.printf("Final point: %d\n", points + inPoints);
        System.out.printf("Average points: %d\n", points / tournaments);
        System.out.printf("%.02f%%\n", wins * 1.0 / tournaments * 100);
    }
}
