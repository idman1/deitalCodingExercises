package tdd.Testing;

import java.util.Scanner;

public class Native002 {
    public static void main(String[] args) {
        Native semicolon = new Native("idris",61,"regnos");
        Scanner input = new Scanner(System.in);

        semicolon.setAge(60);
        System.out.println(semicolon.getAge());
        System.out.println("Enter your age");
        int newAge = input.nextInt();

        System.out.println(semicolon.getName());
        semicolon.setName("idris");

        semicolon.setChorhot("regnos");
        System.out.println(semicolon.getChorhot());
    }


}
