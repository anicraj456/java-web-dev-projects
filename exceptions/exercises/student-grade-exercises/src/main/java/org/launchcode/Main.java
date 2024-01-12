package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter vale for x:");
        int xValue =input.nextInt();
        System.out.println("Enter vale for y:");
        int yValue =input.nextInt();
        input.close();

        Divide(xValue,yValue);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println(CheckFileExtension(""));
    }

    public static int Divide(int x, int y) //throws RuntimeException
    // Write code here!
    {
        int result;
        try {
            if (y == 0) {
                throw new ArithmeticException("invalid_division");
            } else {
                return x / y;
                System.out.println("result :" + result);
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static int CheckFileExtension(String fileName)
         {

        // Write code here!

        int points = 0;
        try{
            if (fileName.contains("Program.java") {
                  points =1;
            }else if (fileName != ".java") {
                points = 0;
            } else if (fileName.contains("")) {
                points = -1;
            } else if (fileName == ""){
                return points = points - 1;
            throw new NullPointerException("file should be .java");
        }
             catch (NullPointerException e) {
                e.printStackTrace();
            }
        return points;

    }

}