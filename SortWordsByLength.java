import java.util.Arrays;
import java.util.Comparator;

public class SortWordsByLength {
    public static void main(String[] args) {

        String[] words = {
            "Java",
            "Programming",
            "Code",
            "AI",
            "Developer",
            "Computer"
        };

        // Sort words by length
        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Words sorted by length:");

        for (String word : words) {
            System.out.println(word);
        }
    }
}