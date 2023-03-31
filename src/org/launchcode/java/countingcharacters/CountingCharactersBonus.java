package org.launchcode.java.countingcharacters;

import java.util.Scanner;
import java.util.HashMap;

public class CountingCharactersBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to be counted: ");
        String newString;
        newString = input.nextLine();
        newString = newString.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] charactersInString = newString.toCharArray();
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (int i = 0; i < charactersInString.length; i++) {
            if (!letterCount.containsKey(charactersInString[i])) {
                letterCount.put(charactersInString[i], 1);
            }
            else {
                letterCount.put(charactersInString[i], (letterCount.get(charactersInString[i]) + 1));
            }
        }
        System.out.println(letterCount);
    }
}

