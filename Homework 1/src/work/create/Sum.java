package work.create;

import java.util.Scanner;

public class Sum
{
   // Write a program that will sum up all numbers from 0 up to a target number.
   // For example, for an input number 5, result should be 15 (0+1+2+3+4+5)

    public static void main(String[] args)
    {
        calculeazaSuma();
    }

    public static void calculeazaSuma()
    {
        Scanner readNumber = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = readNumber.nextInt();

        int sum = 0;
        for (int i=0; i<=n; i++)
        {
            sum = sum + i;
        }

        System.out.println("Suma numerelor este: " + sum);
    }
}
