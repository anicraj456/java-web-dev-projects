package org.launchcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import java.util.Scanner;
public class ArrayListPractice {
    public static void main(String[] args) {
        Integer[] numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19};
        List<Integer> arrayListNumbers = Arrays.asList(numbers);
        System.out.println(sumEven(arrayListNumbers));
        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        //String[] words = {"queen", "king", "anita", "arshu", "apsi", "yellow", "white"};
        List<String> arrayListWords = Arrays.asList(words);
        wordLength(arrayListWords);
    }
    public static int sumEven(List<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
        return total;
    }

    public static void wordLength(List<String> word) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length:");
        int num = input.nextInt();
        for (int i = 0; i < word.size(); i++) {
            String wordString = word.get(i);
            if (wordString.length() == num) {
                System.out.println(wordString);
            }
        }
    }


}


