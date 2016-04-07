package com.kevinmichie;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by kevinmichie on 4/6/16.
 */
public class GuessTheNumber {
    int theNUMBER;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber(){
        Random random = new Random();
        max = 100;
        theNUMBER = Math.abs(random.nextInt()) % (max + 1);
    }

    public void play(){
        while(true) {
            int move = scanner.nextInt();
            if (move > theNUMBER) {
                System.out.println("Your number is too big");
            } else if (move < theNUMBER) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("YOU GOT IT!");
                break;
            }
        }
    }
    public static void howBigIsMyNumber(int x){
        if( x >= 0 && x <= 10){
            System.out.println("Our number is small.");
        }
        else if (x >=11 && x<= 100){
            System.out.println("Our number is big.");
        }
        else{
            System.out.println("Our number is out of range.");
        }
    }

    public static void main(String[] args) {
     GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome to my game. Try and"
        +" guess my number between 0 and " +guessGame.max+
        " inclusive.");
        guessGame.play();
    }
}
