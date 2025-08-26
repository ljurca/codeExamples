package basics;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("cat");
        words.add("mail");
        words.add("dog");
        words.add("cat"); // won't add it again
        System.out.println(words); //don’t know the order
        for (String word: words)
            System.out.println(word);


        TreeSet<String> wordsTree = new TreeSet<>();
        wordsTree.add("house");
        wordsTree.add("cat");
        wordsTree.add("mail");
        wordsTree.add("dog");

        // Will print alphabetically
        System.out.println(wordsTree);

        // First element
        String firstElement = wordsTree.first();
        System.out.println(firstElement);

        // Finds a key smaller than "mail", but the closest
        String test = wordsTree.lower("mail");
        System.out.println(test);

        // Finds element greater than or equal to arg1, and strictly less than arg2
        System.out.println(wordsTree.subSet("drain", "joke"));

        // Would not work because we need to tell Java how to compare BankAccounts (now implemented though)
        // There are two elements, balance and owner, so which do we sort? Java does not know
        TreeSet<BankAccount> setb = new TreeSet<>();
        setb.add(new BankAccount(50, "Smith"));
        setb.add(new BankAccount(150, "Jones"));
        System.out.println(setb);

        // However, it would work if BankAccount implemented Comparable
        // ex: public class BankAccount implements Comparable<BankAccount>
        // java can implement the methods for you if you type this!



    }
}
