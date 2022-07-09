package Excersises_02;

import java.util.Scanner;

public class WorldRecordSwiming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double time = Double.parseDouble(scan.nextLine());
        double delay = Math.floor(distance/15);

        double myrecord = distance*time+12.5*delay;

                if(myrecord<record) {
                    System.out.printf("Yes, he succeeded! The new world record is %.02f seconds.", myrecord);
                } else {
                    System.out.printf("No, he failed! He was %.02f seconds slower.", myrecord-record);
                }




    }
}
