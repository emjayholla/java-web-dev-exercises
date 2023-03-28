package exercises;

import java.util.Scanner;

public class mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int miles = input.nextInt();
        System.out.println("How many gallons of has have you used?:");
        int gallons = input.nextInt();
        System.out.println("Your MPG is:");
        System.out.println(miles/gallons);
    }

}

