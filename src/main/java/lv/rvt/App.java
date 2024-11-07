package lv.rvt;

import java.util.*;
import lv.rvt.Person;
import lv.rvt.Product;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Izveidojam trīs Statistics objektus
        Statistics totalSum = new Statistics(0, 0, 0.0);  
        Statistics evenSum = new Statistics(0, 0, 0.0);   
        Statistics oddSum = new Statistics(0, 0, 0.0);    

        System.out.println("Ievadiet skaitļus (beigt ar -1):");

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            totalSum.addNumber(number);

            if (number % 2 == 0) {
                evenSum.addNumber(number);
            } else {
                oddSum.addNumber(number);
            }
        }

        // Izdrukājam rezultātus
        System.out.println("Summa: " + totalSum.sum());  
        System.out.println("Pāra skaitļu summa: " + evenSum.sum());  
        System.out.println("Nepāra skaitļu summa: " + oddSum.sum());  
        
        scanner.close();
    }
}