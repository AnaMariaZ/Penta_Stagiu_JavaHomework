package work.create;

import java.util.ArrayList;
import java.util.Scanner;
public class MinMaxAverage {
    public static void main(String[] args) {
        //minOfArrayList();
        //maxOfArrayList();
        averageOfArrayList();
    }


    public static int myList() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int nr = number.nextInt();

        return nr;
    }

    public static int minOfArrayList() {
        ArrayList list = new ArrayList();
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        int min = (int) list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > (int) list.get(i)) {
                min = (int) list.get(i);
            }
        }
        System.out.println("The minimum value is: " + min);
        return min;
    }

    public static int maxOfArrayList() {
        ArrayList list = new ArrayList();
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        int max = (int) list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < (int) list.get(i)) {
                max = (int) list.get(i);
            }
        }
        System.out.println("The minimum value is: " + max);
        return max;
    }

    public static double averageOfArrayList() {
        ArrayList list = new ArrayList();
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        double average = 0.0;
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + (int)list.get(i);
        }
        average = sum/list.size();
        System.out.println("The average is: " + average);
        return average;
    }
}