package Excersises_04_For_loops;

import java.util.Scanner;

public class Hystogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scan.nextLine());

            if (number < 200) {
                p1++;
            } else if (number < 400) {
                p2++;

            } else if (number < 600) {
                p3++;

            } else if (number < 800) {
                p4++;

            } else {
                p5++;
            }


        }
        System.out.printf("%.02f%%\n", p1*1.0/n*100);
        System.out.printf("%.02f%%\n", p2*1.0/n*100);
        System.out.printf("%.02f%%\n", p3*1.0/n*100);
        System.out.printf("%.02f%%\n", p4*1.0/n*100);
        System.out.printf("%.02f%%\n", p5*1.0/n*100);
    }
}