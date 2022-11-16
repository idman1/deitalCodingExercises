package chaptertwo;

import java.util.Scanner;

public class ProductOfThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int x = input.nextInt();

        System.out.println("Enter an integer: ");
        int y = input.nextInt();

        System.out.println("Enter an integer: ");
        int z = input.nextInt();

        int result = x * y * z;
        System.out.printf(" Product is: %d",result);


    }
}
