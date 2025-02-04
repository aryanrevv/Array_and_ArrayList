/*
NAME: Aryan Kiran Revankar
PRN: 24070126502
BATCH: AIML 2023-27
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
        // Convert Array to ArrayList
        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList from Array: " + arrayList);

        // Convert ArrayList to Array
        List<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Elephant");
        String[] newArray = list.toArray(new String[0]);
        System.out.println("Array from ArrayList: " + Arrays.toString(newArray));
    }
}