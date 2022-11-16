package chaptertwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int firstNum = input.nextInt();

        System.out.println("Enter an integer: ");
        int secondNum = input.nextInt();

        System.out.println("Enter an integer");
        int thirdNum = input.nextInt();

        int sum = (firstNum * firstNum) +(secondNum * secondNum) + (thirdNum * firstNum);
        int product = (firstNum *firstNum) *(secondNum * secondNum) *(thirdNum * firstNum);
        int average = (firstNum + secondNum + thirdNum)/3 ;
        if (sum > product){
            System.out.println("is");
        }

        System.out.printf("The sum: %d The product: %d The average: %d",sum,product,average);

    }

}