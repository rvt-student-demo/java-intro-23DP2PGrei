package lv.rvt;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random number = new Random();
        int randnum = number.nextInt(10);

        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guess: ");

        while(true){
            int guess = Integer.valueOf(scanner.nextLine());
            if (guess == randnum){
                System.out.println("RIGHT!");
                System.out.println("You have won the game.");
                break;
        }
            else {
                System.out.println("Wrong!");
            }
        }
    }
}  




