import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {

        String[] names = {
            "Dipendra",
            "Aman",
            "Rahul",
            "Sohan",
            "Priya",
            "Neha"
        };

        Arrays.sort(names);

        System.out.println("Names in Alphabetical Order:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}