import java.util.HashSet;

public class CommonCharacters {
    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "gaming";

        HashSet<Character> set = new HashSet<>();

        // Store characters of first string
        for (char ch : str1.toCharArray()) {
            set.add(ch);
        }

        System.out.print("Common Characters: ");

        HashSet<Character> printed = new HashSet<>();

        // Find common characters
        for (char ch : str2.toCharArray()) {
            if (set.contains(ch) && !printed.contains(ch)) {
                System.out.print(ch + " ");
                printed.add(ch);
            }
        }
    }
}