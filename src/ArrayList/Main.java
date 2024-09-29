package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /// Important ArrayList Methods

//        add(E e): Adds the specified element to the end of the list.

//        add(int index, E element): Inserts the specified element at the               specified position in the list.

//        remove(int index): Removes the element at the specified position              in the list.

//        remove(Object o): Removes the first occurrence of the specified               element from the list.

//        get(int index): Returns the element at the specified position in              the list.

//        set(int index, E element): Replaces the element at the specified              position in the list with the specified element.

//        size(): Returns the number of elements in the list.

//        clear(): Removes all elements from the list.

//        contains(Object o): Returns true if the list contains the                     specified element.

//        indexOf(Object o): Returns the index of the first occurrence of               the specified element, or -1 if the list does not contain the               element.

//        isEmpty(): Returns true if the list contains no elements.

//        toArray(): Returns an array containing all the elements in the                list.

//        subList(int fromIndex, int toIndex): Returns a view of the portion                of the list between the specified fromIndex, inclusive, and                 toIndex, exclusive.

//         trimToSize(): Trims the capacity of the ArrayList to be the                  list's current size.


        /// Basic ArrayList Operation

        //1:Create an ArrayList of Strings: Initialize an `ArrayList` of strings and add at least five fruit names. Print the list.

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Grape");
        //System.out.println(fruits);


        //2:Access Elements: Create an `ArrayList` of integers, add 10 random numbers, and print the element at index 5.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        //System.out.println(numbers.get(5));


        //3:Remove Element: Create an `ArrayList` of names and remove the name at index 2. Print the updated list.

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Sam");
        //System.out.println("removed: "+names.remove(2)+"\n"+"List: "+ names);

        //4:Iterate Using For Loop: Initialize an `ArrayList` with five country names and iterate through the list using a for loop to print each country

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Germany");
        countries.add("India");
        countries.add("United States");
        countries.add("France");
//        for(String country : countries){
//            System.out.println(country);
//        }

        //5:Check for Existence: Write a method that takes an `ArrayList` and a string as arguments and returns true if the string is in the list, false otherwise.
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("New York");
        cities.add("New Japan");
        cities.add("New York");
        //System.out.println(isAvailable(cities,"Tokyo"));


        //6: **Count Occurrences**: Write a method that counts how many times a specified element appears in an `ArrayList`.

        ArrayList<Integer> set = new ArrayList<>();
        set.add(550);
        set.add(547);
        set.add(548);
        set.add(547);
        set.add(550);
        set.add(547);
        //System.out.println(occurrenceCount(set,550));

        //7: **Clear the List**: Create an `ArrayList` of strings, add five names, and then clear the list. Print the list to confirm it’s empty.
        ArrayList<String> st = new ArrayList<>();
        st.add("Apple");
        st.add("Banana");
        st.add("Orange");
        st.add("Pear");
        st.add("Grape");
        st.clear();
        //System.out.println(st);

        //8: **Insert Element at Index**: Create an `ArrayList` of numbers, add 10 random integers, and insert a number at index 3. Print the updated list.
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);
        intList.set(3,0);
        //System.out.println(intList);

        //9: Print the size of a arraylist
        ArrayList<Integer> intList2 = new ArrayList<>();
        intList2.add(1);
        intList2.add(2);
        intList2.add(3);
        intList2.add(4);
        //System.out.println(intList2.size());

        // 10: print the index of an element

        ArrayList<Integer> intList3 = new ArrayList<>();
        intList3.add(1);
        intList3.add(2);
        intList3.add(3);
        intList3.add(4);
        //System.out.println(intList3.indexOf(3));


        /// Intermediate ArrayList Task

        //1: Create an `ArrayList` of integers, add 10 random numbers, and sort the list in ascending order. Print the sorted list.
        ArrayList<Integer> intList4 = new ArrayList<>();
        intList4.add(33);
        intList4.add(45);
        intList4.add(47);
        intList4.add(38);
        intList4.add(21);
        intList4.add(12);
        intList4.add(16);
        Collections.sort(intList4);
        //System.out.println(intList4);

        //2: Write a method that reverses the order of elements in an `ArrayList`.
        ArrayList<Integer> intList5 = new ArrayList<>();
        intList5.add(1);
        intList5.add(2);
        intList5.add(3);
        intList5.add(4);
        intList5.add(5);

        Collections.reverse(intList5);
        //System.out.println(intList5);


        //3: find max value
        //System.out.println(maxValue(intList5));

        //4: Convert ArrayList to array
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        toArray(list1);
        //System.out.println(list1);


        //5:Find Unique Elements: Write a method that finds and returns unique elements from an `ArrayList`.
        //6: Removing duplicates from an array
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Banana");
        list2.add("Orange");
        //System.out.println("first: " + list1.get(0) + ", last: " + list2.get(list2.size()-1));
        //System.out.println(uniqueStrings(list2));
        //System.out.println(removeDuplicates(list2));

        //7: **Find Common Elements**: Write a method that finds and returns common elements between two `ArrayLists`.
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Pear");
        list3.add("Jack fruit");
        list3.add("Mango");
        list3.add("Banana");

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Banana");
        list4.add("Mango");

        //System.out.println(commonElements(list3,list4));

        //8: **Second Largest Element**: Write a method that finds the second largest element in an `ArrayList` of integers.
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.23);
        doubleList.add(3.49);
        doubleList.add(3.78);
        doubleList.add(3.10);
        doubleList.add(3.84);
        doubleList.add(3.90);
        //System.out.println(secondLargestElement(doubleList));

        //9: Merge Two Arraylist
        ArrayList<Integer> listA  = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);
        listB.add(6);
        listB.add(7);
        listB.add(8);
        listB.add(9);
        listB.add(10);
        //System.out.println(mergedArray(listA,listB));



    }

    private static List<Integer> mergedArray(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        List<Integer> mergedList = new ArrayList<>(listA);
        mergedList.addAll(listB);
        return mergedList;

    }

    private static double secondLargestElement(ArrayList<Double> doubleList) {
        if(doubleList.size()< 2){
            throw new IllegalArgumentException("list must contain at least 2 elements");
        }

        double largest = Double.NEGATIVE_INFINITY;
        double secondLargest = Double.NEGATIVE_INFINITY;
        for(double num : doubleList){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    private static List<String > commonElements(ArrayList<String> list3, ArrayList<String> list4) {
        List<String> commonElements = new ArrayList<>();
        for(String s: list3){
            if(list4.contains(s)){
                commonElements.add(s);
            }
        }
        return commonElements;
    }

    public static boolean isAvailable(ArrayList<String > list, String name){
        for(String s : list){
            if(s.equals(name)){
                return true;
            }
        }
        return false;
    }

    public static int occurrenceCount(ArrayList<Integer> list, int i){
        int count = 0;
        for (int x: list){
            if(x == i){
                count++;
            }
        }
        return count;
    }

    public static int maxValue(ArrayList<Integer> list){
        int max = 0;
        for (int x: list){
            if(x > max){
                max = x;
            }
        }
        return max;
    }

    public static String[] toArray(ArrayList<String> list){
        String[] arr = new String[list.size()];
        list.toArray(arr);
        return arr;
    }

    public static List<String> uniqueStrings(ArrayList<String> list){
        List<String> uniqueStrings = new ArrayList<>();

        //Iterate through each element in the list
        for(int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            boolean isUnique = true;
            for(int j = 0 ; j <list.size(); j++){
                if(i != j && s.equals(list.get(j))){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                uniqueStrings.add(s);
            }
        }
        return uniqueStrings;
    }

    public static List<String> removeDuplicates(ArrayList<String> list){
        List<String> uniqueStrings = new ArrayList<>();
        for(String s: list){
            if(!uniqueStrings.contains(s)){
                uniqueStrings.add(s);
            }
        }
        return uniqueStrings;
    }
}
