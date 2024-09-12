package lv.rvt;

import java.util.*;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi pirmo skaitli: ");

        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi otro skaitli: ");

        int second = Integer.valueOf(scanner.nextLine());

        int result = first + second;

        System.out.println(first + " + " + second + " = " + result);


    }

}
