package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /// Important LinkedList Methods
//        1. Adding Elements:
//        add(E e): Adds an element to the end of the               list.
//        add(int index, E element): Inserts an element at          the specified position in the list.
//        addFirst(E e): Adds the element at the beginning          of the list.
//        addLast(E e): Adds the element at the end of the          list.
//        2. Removing Elements:
//        remove(): Removes the first element (head) of             the list.
//        remove(int index): Removes the element at the             specified position.
//        removeFirst(): Removes the first element of the           list.
//        removeLast(): Removes the last element of the             list.
//        clear(): Removes all the elements from the list.
//        3. Retrieving Elements:
//        get(int index): Returns the element at the                specified position.
//        getFirst(): Retrieves the first element of the            list.
//        getLast(): Retrieves the last element of the              list.
//        4. Checking Elements:
//        contains(Object o): Checks if the list contains           the specified element.
//        isEmpty(): Returns true if the list contains no           elements.
//        5. Size of the List:
//        size(): Returns the number of elements in the             list.
//        6. Index Methods:
//        indexOf(Object o): Returns the index of the               first occurrence of the specified element.
//        lastIndexOf(Object o): Returns the index of the           last occurrence of the specified element.
//        7. Queue Operations:
//        offer(E e): Adds the element at the end of the            list (like add() but returns false if it fails).
//        poll(): Retrieves and removes the first element           of the list, or returns null if the list is             empty.
//        peek(): Retrieves, but does not remove, the               first element of the list, or returns null if            the list is empty.
//        8. Iterators:
//        iterator(): Returns an iterator over the                  elements in the list.
//        listIterator(): Returns a list iterator starting          from the beginning.
//        descendingIterator(): Returns an iterator for            iterating the list in reverse order.

        /// Basic LinkedList Operation

        //1: **Create a LinkedList**: Initialize a `LinkedList` of integers and add the numbers 1 to 10. Print the list.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        //System.out.println(list);

        //2: Remove first element
        list.removeFirst();
        //System.out.println(list);

        //3: Iterating using for each loop
        for(int i : list){
            //System.out.println(i);
        }

        //4: check if empty
        //System.out.println(list.isEmpty());

        //5: add element in a specific index
        list.add(3,15);
        //System.out.println(list);

        //6: print the size of list
        //System.out.println(list.size());

        //7: Remove Last Element
        list.removeLast();
        //System.out.println(list);

        //8: clear the list
        list.clear();
        //System.out.println(list);
    }
}
