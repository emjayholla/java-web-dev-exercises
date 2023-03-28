package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner areaOfACircle = new Scanner(System.in);
        System.out.println("Enter a radius for your circle:");
        Double radius = areaOfACircle.nextDouble();
        System.out.println("The area of your circle is " + (3.14*radius*radius) + "!");
    }

}
