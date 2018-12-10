package work.create;

import java.util.Scanner;

public class AverageSum
{

    /*Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
    For example, for range numbers 1 to 100 output should be:

    Sum for range 1 to 100 : 5050
    Average for range 1 to 100 : 50.5 */

    public static void main(String [] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter minimum number: ");
        double min = number.nextDouble();

        System.out.println("Enter maximum number: ");
        double max = number.nextDouble();

        average(min,max);
        sum(min, max);
    }

    public static void average(double min, double max){
        double average ;

        average = (min + max)/2;

        System.out.println("The average is: " + average);

    }

    public static void sum(double min, double max){
        double sum = 0;

        for (double i = min; i <=max; i++){
            sum = sum + i;
        }

        System.out.println("Suma este: " + sum);
    }
}
