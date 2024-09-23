package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /* Basic ArrayList Operation */

        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.add(3);
        listOfIntegers.add(4);
        listOfIntegers.add(5);
        listOfIntegers.remove(2);
        //System.out.println(listOfIntegers.size());
        //System.out.println(listOfIntegers);

        // Inserting and Replacing Elements
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hello");
        listOfStrings.add("My World");
        listOfStrings.set(1,"Aishteyiru");
        listOfStrings.set(0,"Anata");
        //System.out.println(listOfStrings);


        // CHECKING FOR ELEMENTS
        ArrayList<String> list = new ArrayList<>();
       list.add("Apple");
       list.add("Orange");
       list.add("Citrus");
       list.add("Banana");

       String searchString = "Citrus";
       if(list.contains(searchString)){
           //System.out.println(searchString + " " + "is present in the list");
       }else{
           //System.out.println(searchString + " " + "isn't present in the list");
       }

       String findString = "Orange";
       int index = list.indexOf(findString);
       if (index!= -1){
           //System.out.println(findString + " " + "is found at index "+ index);
       }else {
           //System.out.println(findString + " is not available in the list");
       }

       String removeString = "Citrus";
       boolean removed = list.remove(removeString);
       if(removed){
           //System.out.println(removeString + " was removed from the list");
       }else{
           //System.out.println(removeString + " was not found in the list");
       }

        //System.out.println("Updated List: " + list);


        // Iterating through arraylist
        ArrayList<Float> listOfFloat = new ArrayList<>();
        listOfFloat.add(5.55f);
        listOfFloat.add(6.55f);
        listOfFloat.add(7.55f);
        listOfFloat.add(8.55f);
        listOfFloat.add(9.55f);
        listOfFloat.add(10.55f);
        float sum = 0.0f;
        for (Float aFloat : listOfFloat) {
            sum += aFloat;
        }
        //System.out.println("sum of floatList: "+sum);


        //SubList and Sorting
        ArrayList<String> listOfCities = new ArrayList<>();

        listOfCities.add("Dhaka");
        listOfCities.add("Delhi");
        listOfCities.add("Kathmandu");
        listOfCities.add("Beijing");
        listOfCities.add("Istanbul");
        listOfCities.add("Lahore");

        List<String> subList = new ArrayList<>(listOfCities.subList(0, 3));

        Collections.sort(listOfCities);
        //System.out.println("Sorted cities: "+ listOfCities);
        //System.out.println("Sublist of cities: "+ subList);


        //Handling duplicate values

        ArrayList<Integer> listOfDuplicateInteger = new ArrayList<>();

        listOfDuplicateInteger.add(22);
        listOfDuplicateInteger.add(37);
        listOfDuplicateInteger.add(52);
        listOfDuplicateInteger.add(22);
        listOfDuplicateInteger.add(52);
        listOfDuplicateInteger.add(11);

        List<Integer> uniqueList = removeDuplicate(listOfDuplicateInteger);
        //System.out.println(uniqueList);


        //Conversion and Manipulation
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(array));
        list1.add(55);
        list1.remove(5);
        list1.set(1,0);
        //System.out.println(list1);
        Integer[] newArray = list1.toArray(new Integer[0]); //new Integer[0]: This is an empty array of Integer objects, with a length of 0. It's used as a parameter to the toArray() method.
        //System.out.println(Arrays.toString(newArray));      //The toArray() method takes this empty array as a parameter, and returns a new array that is the same type as the parameter array (Integer[]).
                                                            // The new array is populated with the elements from the original list.


        // Handling Empty ArrayList

        ArrayList<String> emptyList = new ArrayList<>();
        if(emptyList.isEmpty()){
            //System.out.println("The list is empty");
        }else {
            //System.out.println(emptyList.get(0));
        }
        emptyList.add("Hello Javier");
        //System.out.println(emptyList);

        //ArrayList of custom object
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Anata", 1));
        studentList.add(new Student("Aishteyiru", 2));
        studentList.add(new Student("Javier", 3));
        printStudentInfo(studentList);

    }

    public static List<Integer> removeDuplicate(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static void printStudentInfo(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Name: " + student.name + "\n" + "Roll: " + student.rollNo+"\n");
        }
    }

}

class Student {
    String name;
    int rollNo;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
