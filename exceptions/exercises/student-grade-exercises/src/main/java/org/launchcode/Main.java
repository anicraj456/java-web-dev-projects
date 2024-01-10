package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        String  fileName;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the file name:");
        fileName= input.nextLine();
        input.close();

        //CheckFileExtension tempFile = new CheckFileExtension();
        //tempFile.setCheckFileExtension(fileName);
    }

    public static int Divide(int x, int y) //throws RuntimeException
    // Write code here!
    {
        try {
            if (y == 0) {
                throw new ArithmeticException("invalid_division");
            } else {
                return x / y;
            }
        } catch (ArithmeticException invalid_division) {
            System.out.println("invalid_division");
        }
        return x;
    }
    public int CheckFileExtension(String fileName) {

        // Write code here!
        int points = 0;
        if (fileName == "Program.java") {
            return points = points + 1;
        }else if (fileName == "MyCode.java") {
            return points = points + 1;
        } else if(fileName == "CoolProgram.java") {
            return points = points + 1;
        } else if (fileName == null) {
            return points = points - 1;
        } else if (fileName == ""){
            return points = points - 1;
        } else
            try {
                throw new FileException();
            } catch (FileException e) {
                e.printStackTrace();
            }
        return points = points + 0;

    }

}