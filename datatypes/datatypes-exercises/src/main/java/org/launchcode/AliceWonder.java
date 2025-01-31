package org.launchcode;

import java.util.Scanner;

public class AliceWonder {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a term to search:");
        String name = input.nextLine();
        String str = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once " +
                "or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, ‘and what is " +
                "the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase.contains(name));
        Integer index = str.indexOf(name);
        Integer length = name.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = str.replace(name, "REMOVED");
        System.out.println(modifiedSentence);
        }
}
