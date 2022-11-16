package chaptertwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter an integer: ");
        int secoundNumber = input.nextInt();

        int sum = (firstNumber * firstNumber) +(secoundNumber * secoundNumber);
        int diff = (firstNumber * firstNumber) - (secoundNumber * secoundNumber);

        System.out.printf("sum of their squares: %d the difference of the squares: %d ",sum,diff);
    }
}
