package work.create;

import java.util.Scanner;

public class CheckTheEndOfAString {
    public static void main(String[] args){
        checkTheString();
    }

    private static void checkTheString(){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter intial string: ");
        String myString = str.nextLine();

        System.out.println("Enter the string that you want to search for at the end of the intial one: ");
        String searchingFor = str.nextLine();

        if (myString.endsWith(searchingFor)){
            System.out.println("The specified string is at the end of the initial one");
        }

        else{
            System.out.println("The substring is not at the end of the intial string");
        }
    }
}
