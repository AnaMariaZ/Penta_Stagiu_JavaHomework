package work.create;

import java.util.ArrayList;
import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        concatenateArrays();
    }

    public static int addNumberFirstArray() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number for the first list: ");
        int nr = number.nextInt();

        return nr;
    }

    public static int addNumberSecondArray() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number for the second list: ");
        int nr = number.nextInt();

        return nr;
    }

    public static void concatenateArrays() {
        ArrayList firstList = new ArrayList();
        ArrayList secondList = new ArrayList();
        ArrayList concatenatedArray = new ArrayList();

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

        concatenatedArray.addAll(firstList);
        concatenatedArray.addAll(secondList);

        System.out.println("The concatenated list is: " + concatenatedArray);
    }
}
