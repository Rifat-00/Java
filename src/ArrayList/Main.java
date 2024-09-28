package ArrayList;

import java.util.ArrayList;

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
}
