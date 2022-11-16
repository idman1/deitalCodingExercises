package chaptertwo;

import java.util.Scanner;
//  program performs a sample payroll calculation

public class LeavingTheCursor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter an integer: ");
        int value = input.nextInt();
        int b = 8;
        int c = 9;

        int a = b * c;
        System.out.printf("product is %d",a);
    }
}
