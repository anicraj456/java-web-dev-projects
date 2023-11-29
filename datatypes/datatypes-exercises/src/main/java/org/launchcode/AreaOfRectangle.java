package org.launchcode;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        int length,breadth,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the Rectangle:");
        length = input.nextInt();
        System.out.println("Enter breadth of the Rectangle:");
        breadth = input.nextInt();
        area = length * breadth;
        System.out.println("Area of the rectangle is: "+ area);
    }
}
