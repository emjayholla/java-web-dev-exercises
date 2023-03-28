package exercises;

import java.util.Scanner;

public class alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Type a word to search for in the first line:");
        String searchTerm = input.nextLine();

        int index = firstLine.indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstLine.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}