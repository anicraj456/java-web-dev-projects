package org.launchcode;

import java.util.Scanner;

public class Area {
        public static void main(String[] args){
            double radius;
            double area;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the radius of the circle ::");
            radius = input.nextDouble();
                area = Circle.getArea(radius);
                System.out.println("Area of the circle is: " + area);
            }
        }

