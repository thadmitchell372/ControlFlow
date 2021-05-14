package com.company;

import java.util.Scanner;

public class Questions {
    public static void QuestionsOne() {


        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to continue: ");
        String yes = input.nextLine();

        if (yes.equals("yes") || yes.equals("y")) {

        } else {
            System.out.println("Bye");
            return;
        }

        System.out.println("Do you have a red car?(yes,no): ");
        String car = input.nextLine();

        System.out.println("What is your favorite pets name?: ");
        String pet = input.nextLine();

        System.out.println("What is the age of your pet?: ");
        int age = input.nextInt();

        System.out.println("What is your lucky number?: ");
        int number = input.nextInt();

        System.out.println("Do you have a favorite quarterback?(yes or no): ");
        input.nextLine();
        String quarterBack = input.nextLine();

        if (quarterBack.equals("yes") || quarterBack.equals("y") || quarterBack.equals("Y")) {
            System.out.println("What is their number?: ");
            String qbNum = input.nextLine();
        }


        System.out.println("Enter a random number 1 through 50: ");
        int randNumber = input.nextInt();
        if (randNumber > 50 || randNumber < 1) {
            System.out.println("You're funny...");
        }
        Lottery.lottoNums();
    }
}
