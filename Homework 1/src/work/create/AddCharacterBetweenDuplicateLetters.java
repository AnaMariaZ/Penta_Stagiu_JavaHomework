package work.create;

import java.util.Scanner;

public class AddCharacterBetweenDuplicateLetters {
    public static void main(String[] args){
        findAndReplace();
    }

    private static void findAndReplace(){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter intial string: ");
        String myString = str.nextLine();

        String newString;

        for (int i=0; i <= myString.length(); i++){
            if ((myString.charAt(i) == myString.charAt(i+1))){
               newString = (myString.substring(i-1, i+1) + "#" + myString.substring(i+1));
                System.out.println("The new string is: " + newString);
            }
         //   System.out.println("The new string is: " + newString);
        }

    }
}
