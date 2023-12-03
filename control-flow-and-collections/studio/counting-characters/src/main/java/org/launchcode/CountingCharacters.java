package org.launchcode;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class CountingCharacters {
    public static void main(String args[]){
        //String myString = "If the product of two terms is zero then common sense says " +
        //"at least one of the two terms has to be zero to start with." +
        // " So if you move all the terms over to one side, you can put" +
        // " the quadratics into a form that can be factored allowing that " +
        // "side of the equation to equal zero. Once you’ve done that, " +
        // "it’s pretty straightforward from there";

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        Scanner input = new Scanner(System.in);
        String myString;
        System.out.println("Enter a String:");
        myString= input.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
        char[] charactersInString = myString.toCharArray();
        for(int i=0;i<charactersInString.length;i++){
            charMap.put(charactersInString[i],0);
        }
        System.out.println("created map "+charMap);
        for(int i=0;i<charactersInString.length;i++){
            if(charMap.containsKey(charactersInString[i])){
                int counttVal = charMap.get(charactersInString[i]);
                counttVal = counttVal+1;
                charMap.put(charactersInString[i],counttVal);
            }
        }
        System.out.println("Each char times: " +charMap);
    }
}

