package com.company;

import java.util.Scanner;

public class Lottery {
    public static void lottoNums() {
        Scanner input = new Scanner(System.in);
        int lottoArray[] = new int[5];
        for (int x=0;x<5;x++){
            int num = (int)(Math.random()*65);
            lottoArray[x]=num;
        }
        int magicBall = (int)(Math.random()*75);

        System.out.println("Your lotto numbers are ");

        for (int i=0;i<lottoArray.length; i++) {
            System.out.print(lottoArray[i]+" ");
        }
        System.out.println("And your magic ball number is "+magicBall);
        Replay.replay();
    }
}
