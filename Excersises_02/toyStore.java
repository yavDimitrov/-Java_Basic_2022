package Excersises_02;

import java.util.Scanner;

public class toyStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tripPrice = Float.parseFloat(scan.nextLine());
        int puzzle = Integer.parseInt(scan.nextLine());
        int doll = Integer.parseInt(scan.nextLine());
        int bear = Integer.parseInt(scan.nextLine());
        int minion = Integer.parseInt(scan.nextLine());
        int truck = Integer.parseInt(scan.nextLine());

        double totalPrice = puzzle*2.6+doll*3+bear*4.10+minion*8.2+truck*2;

        if (puzzle+doll+bear+minion+truck >= 50) {
            totalPrice = totalPrice*0.75;
        }

        double profit = totalPrice*0.9;

        if(profit > tripPrice) {
            System.out.printf("Yes! %.02f lv left.", profit - tripPrice);
        } else {
            System.out.printf("Not enough money! %.02f lv needed.", tripPrice-profit);
        }



        
    }
}
