package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(11);
        list.add(22);
        list.add(22);
        list.add(33);
        list.add(33);

        //printList(list);
        System.out.println(removeDuplicates(list));;
    }

    public static void printList(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static List<Integer> removeDuplicates(LinkedList<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }
}
