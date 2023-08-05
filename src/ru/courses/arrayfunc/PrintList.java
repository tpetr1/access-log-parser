package ru.courses.arrayfunc;

import java.util.ArrayList;

public class PrintList {
    public static void printList(ArrayList list) {
        //list.forEach(System.out::println);
        list.forEach((i) -> {
            System.out.print(list.get((Integer) i));
        });
    }
}
