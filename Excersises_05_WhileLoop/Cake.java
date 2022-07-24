package Excersises_05_WhileLoop;
import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int S =width*height;

        while (S > 0){
            String input = scan.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            int parts = Integer.parseInt(input);

            S -= parts;

        }

        if(S >= 0 ) {
            System.out.printf("%d pieces are left.", S);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(S));

        }
    }
}
