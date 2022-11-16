package chapterThree.ClassAssignment;

import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int evil = input.nextInt();


        if (evil % 2 == 0) {
            System.out.println(" %d%Number is even number");
        } else {
            System.out.println("Number is odd number");
        }
    }
}