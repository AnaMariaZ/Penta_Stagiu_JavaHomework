package work.create;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharEncoding {

    /*Write a program that will return a different string representing the alphabet index of each
letter.*/
    //works only with letters that are not uppercase characters
    public static void main(String[] args){
        encodedString();
    }

    private static void encodedString(){
       Scanner str = new Scanner(System.in);
        System.out.println("Enter intial string: ");
        String myString = str.nextLine();

        Map<String,String> encoding = new HashMap<>();
        encoding.put("a", "0");
        encoding.put("b", "1");
        encoding.put("c", "2");
        encoding.put("d", "3");
        encoding.put("e", "4");
        encoding.put("f", "5");
        encoding.put("g", "6");
        encoding.put("h", "7");
        encoding.put("i", "8");
        encoding.put("j", "9");
        encoding.put("k", "10");
        encoding.put("l", "11");
        encoding.put("m", "12");
        encoding.put("n", "13");
        encoding.put("o", "14");
        encoding.put("p", "15");
        encoding.put("q", "16");
        encoding.put("r", "17");
        encoding.put("s", "18");
        encoding.put("t", "19");
        encoding.put("u", "20");
        encoding.put("v", "21");
        encoding.put("w", "22");
        encoding.put("x", "23");
        encoding.put("y", "24");
        encoding.put("z", "25");

        for (HashMap.Entry<String, String> entry : encoding.entrySet()) {
                      myString = myString.replace(entry.getKey(), entry.getValue());
            }
        System.out.println("The new string is: " + myString);
        }


    }


