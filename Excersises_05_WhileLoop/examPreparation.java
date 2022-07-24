package Excersises_05_WhileLoop;
import java.util.Scanner;

public class examPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 int poorGradesLimit = Integer.parseInt(scan.nextLine());

 String problem = scan.nextLine();
 int poorGradesCount = 0;
 boolean isFailed = false;
 double gradesSum = 0;
 int gradesCount = 0;
 String lastProblem = "";

 while (!problem.equals("Enough")) {

     int grade = Integer.parseInt(scan.nextLine());
     gradesSum += grade;
     gradesCount ++;
     lastProblem = problem;

     if (grade <= 4) {
         poorGradesCount ++;
         if (poorGradesCount == poorGradesLimit){

             isFailed = true;
             break;
         }
     }
     problem = scan.nextLine();
 }

 if(isFailed) {
     System.out.printf("You need a break, %d poor grades.", poorGradesCount);
 } else{
     System.out.printf("Avarege score: %.02f \n" +
             "Number of problems: %d\n" +
             "Last problem: %s", gradesSum/gradesCount, gradesCount, lastProblem);

 }
    }
}
