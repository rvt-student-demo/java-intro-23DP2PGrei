package lv.rvt;

import java.util.*;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi savu vārdu: ");

        String name = scanner.nextLine();

        System.out.println("Ievadi savu uzvārdu: ");

        String surname = scanner.nextLine();

        System.out.println("Ievadi savu grupu: ");

        String group = scanner.nextLine();

        System.out.println(name + ' ' + surname + ' ' + group);


    }

}
