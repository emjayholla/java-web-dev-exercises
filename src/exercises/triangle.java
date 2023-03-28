package exercises;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide a value for the length:");
        int length = input.nextInt();
        System.out.println("Provide a value for the height:");
        int height = input.nextInt();
        System.out.println("The area of your rectangle is:");
        System.out.println(length*height);
}

}
