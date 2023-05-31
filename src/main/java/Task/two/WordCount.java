// Implement a program that takes a list of sentences and outputs the word count for each sentence using collections.
package Task.two;

import java.util.Arrays;
import java.util.List;

public class WordCount {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "This is first house in my street.",
                "Here comes another sentence.",
                "And here is a third one."
        );

        for (String sentence : sentences) {
            int wordCount = countWords(sentence);
            System.out.println("Word count: " + wordCount + " - " + sentence);
        }
    }

    public static int countWords(String sentence) {
        List<String> words = Arrays.asList(sentence.split("\\s+"));
        return words.size();
    }
}