package levelupjava;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class LetterPointsMain {
    public static final Map<Character, Integer> letterPoints = Map.ofEntries(Map.entry('A', 1),
            Map.entry('B', 3), Map.entry('C', 3), Map.entry('D', 2), Map.entry('E', 1),
            Map.entry('F', 4), Map.entry('G', 2), Map.entry('H', 4), Map.entry('I', 1),
            Map.entry('J', 8), Map.entry('K', 5), Map.entry('L', 1), Map.entry('M', 3),
            Map.entry('N', 1), Map.entry('O', 1), Map.entry('P', 3), Map.entry('Q', 10),
            Map.entry('R', 1), Map.entry('S', 1), Map.entry('T', 1), Map.entry('U', 1),
            Map.entry('W', 4), Map.entry('V', 4), Map.entry('X', 8), Map.entry('Y', 4),
            Map.entry('Z', 10));

    public static int wordScoreCalculator(String word) {
        // loop to iterate word
        // get that word value from map
        // sum it

        AtomicInteger sum = new AtomicInteger();
        word = word.toUpperCase();
        word.chars()
                .mapToObj(n -> (char) n)
                .forEachOrdered(ch -> {
                            if (letterPoints.containsKey(ch)) {
                                sum.addAndGet(letterPoints.get(ch));
                            }
                        }
                );

//        for (int i = 0; i < word.length(); i++) {
//            Character ch = word.charAt(i);
//            if (letterPoints.containsKey(ch)) {
//                sum.addAndGet(letterPoints.get(ch));
//            }
//
//        }

        return sum.get();
    }

    public static void main(String[] args) {
        System.out.println("Enter a word and we'll tell you how many " +
                "points it will earn!");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Your word " + word + " will earn "
                + wordScoreCalculator(word));
        sc.close();
    }
}
