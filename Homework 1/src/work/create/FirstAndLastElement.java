package work.create;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastElement
{
    public static void main(String[] args)
    {
        CheckFirstandLast();
    }

    public static int addNumber(){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int nr = number.nextInt();

        return nr;
    }
    public static boolean CheckFirstandLast(){
        ArrayList list = new ArrayList();
        list.add(addNumber());
        list.add(addNumber());
        list.add(addNumber());
        list.add(addNumber());
        list.add(addNumber());
        list.add(addNumber());
        list.add(addNumber());
        list.add(addNumber());

        int firstElement = (int) list.get(0);
        int lastElement = (int) list.get(list.size()-1);

        if (firstElement == lastElement)
        {
            System.out.println("TRUE: same numbers");
            return true;
        }

        else {
            System.out.println("FALSE: numbers are different");
            return false;
        }

        }

}
