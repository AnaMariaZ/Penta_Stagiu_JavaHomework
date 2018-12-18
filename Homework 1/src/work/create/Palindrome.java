package work.create;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        checkPalindrome();
    }

    private static void checkPalindrome(){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter intial string: ");
        String myString = str.nextLine();

        String reveresedString = "";
        for (int i= myString.length() - 1; i >= 0; i--) {
            reveresedString = reveresedString + myString.charAt(i);
        }
                if (myString.equals(reveresedString)){
                    System.out.println("The string is a palindrome");
                }
                else {
                    System.out.println("The string is not a palindrome");
                }
        }
    }
