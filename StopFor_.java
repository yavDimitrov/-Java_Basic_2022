package Excersises_04_For_loops;

import java.util.Scanner;

public class StopFor_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i=0; i >= 0 ; i++) {

            int number = Integer.parseInt(scan.nextLine());
            if ( number < 0) {
                break;
            }
    }
}
}

