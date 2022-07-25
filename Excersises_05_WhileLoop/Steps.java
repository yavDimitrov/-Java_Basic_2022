package Excersises_05_WhileLoop;
import java.util.Scanner;
public class Steps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int goal = 10000;
        int steps = 0;
        while (goal > steps) {
            String input = scan.nextLine();
            if (input.equals("Going home")) {
                steps += Integer.parseInt(scan.nextLine());
                break;
            }
            steps += Integer.parseInt(input);
        }
        if (steps >= goal) {
            System.out.printf("Goal reached! Good job!\n" + "%d steps over goal!\n", steps - goal);
        } else {
            System.out.printf("%d steps to reach goal!\n", goal - steps);

        }
    }
}
