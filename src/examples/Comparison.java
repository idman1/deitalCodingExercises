package examples;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first number: ");
        int num1 = input.nextInt();

        System.out.println("enter second number: ");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.printf("%d is equal to %d%n", num1, num2);
        }
        if (num1 != num2){
            System.out.printf("%d is not equal to %d%n",num1,num2);}

        if (num1 > num2) {
            System.out.printf("%d is less than %d%n", num1, num2);
        }
        if (num1 <= num2) {
            System.out.printf("%d is less than or equal to %d%n", num1, num2);
        }
        if (num1 >= num2) {
            System.out.printf("%d is greater than or equal to %d%n", num1, num2);
        }






    }
}
