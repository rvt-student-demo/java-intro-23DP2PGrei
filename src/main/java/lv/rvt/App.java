package lv.rvt;

import java.util.*;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Ievadiet ātrumu: ");

        int speed = Integer.valueOf(scanner.nextLine());

        if (speed > 120) {
            System.out.println("Speeding ticket");
        }


    }

}
