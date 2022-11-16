package chapterfour.assignment;

import java.util.Scanner;

public class SentinelLoopingForSmallerAndGreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (end with -1)");
        int userInput = input.nextInt();

        int largest = userInput;
        int smallest = userInput;
       // int count = 0;

        while (userInput != -1) {
            System.out.println("Enter an integer or -1 to end/exit");
             userInput = input.nextInt();
             if (userInput<= -1)
                 userInput = smallest;

            if (userInput > smallest) {
               largest = userInput;
            }
            if (userInput < largest) {
                  smallest = userInput;
            }

            System.out.println("The smallest number is: " + smallest );
            System.out.println("The largest number is: " + largest );
        }


    }
}
