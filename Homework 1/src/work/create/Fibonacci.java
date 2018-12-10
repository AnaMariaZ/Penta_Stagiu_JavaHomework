package work.create;

import java.util.ArrayList;

public class Fibonacci {
    /*Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
    For an input of x = 20 the output should be:

    The first 20 Fibonacci numbers are:
    1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
    The average is 885.5
    */

    public static void main(String[] args){
        fibonacci();
    }

    public static void fibonacci(){
        double pozZero = 0;
        double pozUnu = 1;
        double celPozitii = 0;
        double sumFibonacci = 1;
        double average = 0.0;

        ArrayList fibonacci = new ArrayList();

        fibonacci.add(pozZero);
        fibonacci.add(pozUnu);
        for(int index = 2; index <=20; index++)
        {
            celPozitii = pozUnu + pozZero;
            pozZero = pozUnu;
            pozUnu = celPozitii;

            fibonacci.add(celPozitii);

            sumFibonacci = sumFibonacci + celPozitii;

            average = sumFibonacci / fibonacci.size();
        }

        System.out.println("Fibonacci list: " + fibonacci);
        System.out.println("Sum is: " + sumFibonacci);
        System.out.println("The average is: " + average);
    }
}
