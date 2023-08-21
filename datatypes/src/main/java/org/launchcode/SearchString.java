package org.launchcode;
import java.util.Scanner;
public class SearchString {
    public static void main(String[] args) {
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search term: ");
        String searchTerm = scanner.nextLine();

        boolean isFound = aliceSentence.toLowerCase().contains(searchTerm.toLowerCase());

        System.out.println("Search term found: " + isFound);

        Integer index = aliceSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = aliceSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);

        scanner.close();
    }
}
