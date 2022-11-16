package chapterfour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        //collect the input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        // check user input
        int userInput = input.nextInt();
        if (userInput >10)
            System.out.println("out of range");
       else if (userInput % 2== 0)
            System.out.println("this is even");
            else System.out.println("This is odd biko");

    }
}
