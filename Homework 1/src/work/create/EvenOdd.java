package work.create;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Even();
        Odd();
    }

    public static int myList() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int nr = number.nextInt();

        return nr;
    }

    public static int Even() {
        ArrayList list = new ArrayList();
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());

        int countEven = 0;

        for (int i = 0; i<list.size(); i++){
            if (((int) list.get(i) % 2) == 0){
                countEven = countEven +1;
            }
        }

        System.out.println("In the list are " + countEven + " even numbers");
        return countEven;
    }

    public static int Odd() {
        ArrayList list = new ArrayList();
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());

        int countOdd = 0;
        for (int i = 0; i<list.size(); i++){
            if (((int) list.get(i) % 2) != 0){
                countOdd= countOdd +1;
            }
        }

        System.out.println("In the list are " + countOdd+ " even numbers");
        return countOdd;
    }
    }

