package basics;

import java.util.Arrays;

public class ArrayExample {
    public static void createIntArray() {
        int[] arr; // declare the array arr
        arr = new int[3]; // allocate memory
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 1;
        // int[] arr = {5, 3, 1};

        // Iterate using indices
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        System.out.println();
        // Iterate using a for each loop
       for (int elem: arr)
            System.out.println(elem);

       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));

    }

    public static void createBankAccountArray() {
        // Creates new bank account objects, as well as array that holds two bank account objects
        BankAccount[] accounts = {new BankAccount(300, "Smith"),
                new BankAccount(250, "Jones")};

        // Note: BankAccount[] accounts = new BankAccount[2]; // <- this does NOT create BankAccount objects;
        // it only creates space for references that can point to BankAccount objects

        for (BankAccount account: accounts) {
            System.out.println(account);
        }

    }

    public static void main(String[] args) {
       createIntArray();
       //createBankAccountArray();
    }
}
