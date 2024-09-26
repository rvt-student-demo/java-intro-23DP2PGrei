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

        int fac = 1;  
        for(int i=1; i <= number; i++) {
            fac *= i;
        }
        System.err.println(fac);
        }

            }

