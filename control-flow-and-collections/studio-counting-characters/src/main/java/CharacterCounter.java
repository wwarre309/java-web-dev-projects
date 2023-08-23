import java.util.HashMap;

public class CharacterCounter {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : charactersInString) {
            charCounts.put(c, charCounts.getOrDefault(c,0) + 1);
        }

        for (Character key : charCounts.keySet()) {
            System.out.println(key + ": " + charCounts.get(key));
        }
    }
}