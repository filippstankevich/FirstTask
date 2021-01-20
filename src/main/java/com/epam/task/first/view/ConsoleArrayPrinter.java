package com.epam.task.first.view;

import java.util.List;

import com.epam.task.first.entities.Array;

public class ConsoleArrayPrinter implements ArrayPrinter {

    public void print(final Array array) {
        List<Integer> elements = array.getElements();
        for (Integer element : elements){
            System.out.println(element);
        }
    }
}
