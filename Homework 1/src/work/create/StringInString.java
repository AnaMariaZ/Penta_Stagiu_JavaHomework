package work.create;

import java.util.Scanner;

public class StringInString {
    /*Write a program that test if a given String contains another String.
For example
Given the following base String “Hello java world” and the target test String “java” the output
should be TRUE*/

    public static void main(String[] args){
        checkString();
    }

    private static String readString (){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter initial string: ");
        String myString = str.nextLine();

        return myString;
    }

    private static String stringToCheck (){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter substring: ");
        String littleString = str.nextLine();

        return littleString;
    }
    private static void checkString(){
        if(readString().toLowerCase().contains(stringToCheck().toLowerCase())){
            System.out.println("The intial string contains the substring");
        }
        else{
            System.out.println("The substring is not in the initial string");
        }
    }
}
