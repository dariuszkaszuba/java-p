package jp8;

import java.util.Scanner;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Jp8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Podaj wartosc zmiennej a: ");
        int a=scanner.nextInt();
        System.out.println("Podaj wartosc zmiennej b: ");
        int b=scanner.nextInt();
        scanner.close();

//        System.out.println("pole: "+ (double)a*(a*sqrt(3))/2);
//        double pole =a*(a*sqrt(3))/2;
        double pole =a*b;
//        System.out.println(pow(a,3));
//        System.out.printf("%2.2fzł\n", pole);
        System.out.println(pole);
    }
}
