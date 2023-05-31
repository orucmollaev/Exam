// Filter out strings from a list that have a length less than or equal to 3.
// Input: ["apple", "banana", "cat", "dog", "elephant"]
// Output: ["cat", "dog"]
package Task.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the words:");
        List<String> list = new ArrayList<>();
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        List<String> output = filterStrings(list);
        System.out.println(output);
    }

    public static List<String> filterStrings(List<String> list) {
        List<String> output = new ArrayList<>();
        list.stream()
                .filter(str -> str.length() <= 3)
                .forEach(output::add);
        return output;
    }
}