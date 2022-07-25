package Excersises_05_WhileLoop;
import java.util.Scanner;

public class oldLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String searchedBook = scan.nextLine();
        String currentBook = scan.nextLine();

        boolean isFound = false;
        int bookCount = 0;

        while (currentBook.equals("No More Books")) {

            if (searchedBook.equals(currentBook)) {
                isFound = true;
                break;
            }
            bookCount++;
            currentBook = scan.nextLine();
            }
        if(isFound) {
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.printf("The book you searched is not found.\n" +
                    "You checked %d books", bookCount);

        }
    }
}
