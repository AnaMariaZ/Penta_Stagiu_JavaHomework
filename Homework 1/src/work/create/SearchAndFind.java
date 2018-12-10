package work.create;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchAndFind {
    /*Write a java program to return the index of a target element.
For example:
Given the following array [13,20,14,5,2,8] and a target element 5 the output should be : 3
(because 5 is located at index 3 in the array)*/
    public static void main(String[] args){
        SearchAndFind();
    }

    public static int myList() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int nr = number.nextInt();

        return nr;
    }

    public static int SearchAndFind() {
        ArrayList list = new ArrayList();
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());
        list.add(myList());

        int searchingFor = 5;
        int index = 0;
        for (int i = 0; i < list.size(); i++){
            if (searchingFor == (int) list.get(i)){
                index = list.indexOf(searchingFor);

            }
        }
        System.out.println("The value was located at the index: " + index);
        return index;
    }
}
