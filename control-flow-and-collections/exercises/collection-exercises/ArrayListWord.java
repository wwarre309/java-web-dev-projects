import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWord {
    public static void main(String[] args) {
        // Create a list of words
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("grape");
        wordList.add("orange");
        wordList.add("pear");
        wordList.add("kiwi");
        wordList.add("melon");


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word length: ");
        int searchLength = input.nextInt();

        printWordsWithLength(wordList, searchLength);

        input.close();
    }

    public static void printWordsWithLength(ArrayList<String> list, int length) {
        System.out.println("Words with length " + length + ":");
        for (String word : list) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}