package lv.rvt;

import java.util.*;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        int end = 101;


        for(int i = number; i < end; i++){
            System.out.println(i);
        }

            }
}
