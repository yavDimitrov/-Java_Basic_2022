package Excersises_04_For_loops;
import java.util.Scanner;

public class cleverLili {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int age = Integer.parseInt(scan.nextLine());
        double laundry = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        double sum= 0;
        int money = 10;
        int toyCount = 0;

        for(int i = 1; i <= age; i++){

            if(i % 2 == 0){
                sum += money;
                money += 10;
                sum -= 1;
            } else {

                toyCount ++;

            }


        }

        sum += toyPrice*toyCount;

        if(sum >= laundry) {

            System.out.printf("Yes! %.02f", sum-laundry);
        } else {

            System.out.printf("No! %.02f", Math.abs(sum-laundry));

        }

    }
}
