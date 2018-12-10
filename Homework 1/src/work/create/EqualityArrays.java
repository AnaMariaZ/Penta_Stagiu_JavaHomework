package work.create;

import java.util.ArrayList;
import java.util.Scanner;

public class EqualityArrays {

    /*Write a program that test whether 2 int arrays are equal. Equality in this case means that both
arrays have the same number of elements an element on a specific index in first array is
equal to the element on the same index in the second array.
For example
For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
For the following arrays [] and [] the output should be TRUE
For the following arrays [1,3,2] and [1,3] the output should be FALSE
For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE*/

    public static void main(String [] args){
        testArrays();
    }

    public static int addNumberFirstArray(){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number for the first list: ");
        int nr = number.nextInt();

        return nr;
    }

    public static int addNumberSecondArray(){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number for the second list: ");
        int nr = number.nextInt();

        return nr;
    }
    public static boolean testArrays() {
        ArrayList firstList = new ArrayList();
        ArrayList secondList = new ArrayList();

        firstList.add(addNumberFirstArray());
        firstList.add(addNumberFirstArray());
        firstList.add(addNumberFirstArray());
        firstList.add(addNumberFirstArray());
        firstList.add(addNumberFirstArray());
        firstList.add(addNumberFirstArray());
        firstList.add(addNumberFirstArray());
        firstList.add(addNumberFirstArray());


        secondList.add(addNumberSecondArray());
        secondList.add(addNumberSecondArray());
        secondList.add(addNumberSecondArray());
        secondList.add(addNumberSecondArray());
        secondList.add(addNumberSecondArray());
        secondList.add(addNumberSecondArray());
        secondList.add(addNumberSecondArray());
        secondList.add(addNumberSecondArray());

        for (int i = 0; i < firstList.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (i == j && firstList.get(i) == secondList.get(j)) {
                    System.out.println("The two arrays are equal");
                    return true;
                } else if (i == j && firstList.get(i) != secondList.get(j)){
                    System.out.println("The two arrays are different");
                    return false;
                }
                else if (i != j && firstList.get(i) != secondList.get(j)){
                    System.out.println("The two arrays are different");
                   return false;
                }
            }
        }
    return false;
    }
}
