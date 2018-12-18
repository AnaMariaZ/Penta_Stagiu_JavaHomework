package work.create;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Counter();
    }

    private static int Counter() {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter string: ");
        String myString = str.nextLine();

        char myChar = 'a';

        int counter = 0;

        for (int i=0; i < myString.length(); i++){
            if (myString.charAt(i) == myChar){
                counter++;
            }
        }

        System.out.println("The character is present in the string " + counter + " times");
        return counter;

    }
}
