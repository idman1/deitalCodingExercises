package chaptertwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intg = input.nextInt();

        int num = intg * intg;
        if (num >100 ){
            System.out.println("is greater than 100");

        }
        if (num == 100){
            System.out.println("is equal to 100");
        }
        if (num != 100){
            System.out.println("is not equal to 100");
        }
        if (num< 100){
            System.out.println("is less than 100");
        }
    }
}
