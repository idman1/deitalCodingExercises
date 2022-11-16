package chapterThree.examples;

import java.util.Scanner;

public class AccountExampleMainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AccountExample myAccount = new AccountExample("idris isah");
        AccountExample myAccount2 = new AccountExample("munirat Tela");

        //System.out.printf("Initial name is %s%n%n", myAccount.getName());
        //System.out.println(" please Enter your name " );
       // String thename = input.nextLine();
       // myAccount.setName(thename);

        System.out.println();
        System.out.printf("name is object myAccount is one: %s%n", myAccount.getName());
        System.out.printf("Account name %s%n",myAccount2.getName());


    }
}
