package com.company;

import java.util.Scanner;

public class Replay {
    public static void replay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Want to play again?(yes or no): ");
        String again = input.nextLine();

        if(again.equals("yes") || again.equals("y") || again.equals("YES") || again.equals("Y")){
            Questions.QuestionsOne();
        }else {
            return;
        }
    }
}
