package chapterfour;

import java.util.Scanner;

public class SwitchControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        for (int counter = number-1; counter>=1; counter --){
            //System.out.println("counter"+counter);
           // System.out.println(number+"*"+counter);
            number=number*counter;
            System.out.println(number);

        }
        System.out.println("factorial is: " +number);

    }
}