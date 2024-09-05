package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kā Jūs sauc: ");

        String name = scanner.nextLine();

        System.out.println("Kāds ir Jūsu uzvārds: ");

        String surname = scanner.nextLine();

        System.out.println("Kāda Jums ir grupa: ");

        String group = scanner.nextLine();

        System.out.println(name + ' ' + surname + ' ' + group);

    }

}
