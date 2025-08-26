package basics;

import java.util.HashMap;
import java.util.HashSet;

/** Simple example of using a hash map to store word frequencies */
public class HashMapExample {
    /**
     *     Compute the # of occurrences for each word in the array of words
     *     @param words - an array of strings
    */
     public static void computeFrequencies(String[] words) {
        HashMap<String, Integer> counterMap = new HashMap<>();
        for (String word: words) {
            if (counterMap.containsKey(word)) {
                int currentCount = counterMap.get(word);
                counterMap.put(word, currentCount + 1);
            }
            else {
                counterMap.put(word, 1);
            }
        }

        //System.out.println(counterMap);
        for (String key: counterMap.keySet()) {
            System.out.println(key + " -> " + counterMap.get(key));
        }

        /*
         for (Map.Entry<String, Integer> entry: counterMap.entrySet()) {
             System.out.println(entry.getKey() + " -> " + entry.getValue());
         }
         */

    }

    /**
     * Computes a map where the lengths are the keys, and the set of words that have this length is the value.
     * @param words array of strings
     */
    public static void computeLengthToWords(String[] words) {
        HashMap<Integer, HashSet<String>> lengthToWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
                String word = words[i];
                int l = word.length();
                // Option 1 to update the map:
                if (!lengthToWords.containsKey(l)) {
                    lengthToWords.put(l, new HashSet<>());
                }
                HashSet<String> innerSet = lengthToWords.get(l);
                innerSet.add(word);
                //lengthToWords.get(l).add(word); // can combine two previous lines

                /*
                 // Option 2 to update the map:
                lengthToWords.putIfAbsent(l, new HashSet<>());
                lengthToWords.get(l).add(word);
                */

                /*
                // Option 3 to update the map:
                lengthToWords.computeIfAbsent(l, _ -> new HashSet<>()).add(word);
                 */
        }
        //System.out.println(lengthToWords);

        for (Integer key: lengthToWords.keySet()) {
            System.out.println(key);
            System.out.println(lengthToWords.get(key));
        }
        /*
        for (Map.Entry<Integer, HashSet<String>> entry: lengthToWords.entrySet()) {
            System.out.println(entry);
        }
        */
    }
    public static void main(String[] args) {
        String[] words = { "cat", "dog", "cat", "bird", "elephant", "monkey", "dog", "bull" };
        // System.out.println("Frequencies: ");
        // computeFrequencies(words);
        //System.out.println(System.lineSeparator() + "Length to words: ");
        computeLengthToWords(words);
    }

}
