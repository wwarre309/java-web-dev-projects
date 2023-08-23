import java.util.Arrays;
public class StringArray {
    public static void main (String [] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] words = sentence.split(" ");
        String [] sentences = sentence.split("\\.");
//       System.out.println("Array of Words");
//       for (String word : words) {
//           System.out.println(word);
//       }
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentences));
    }
}
