package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array<T> {

    private final List<T> elements;

    public Array(T... elements){
        this.elements = new ArrayList<T>();
        this.elements.addAll(Arrays.asList(elements));
    }

    public Array(List<T> elements){
        this.elements = elements;
    }


    public List<T> getElements() {
        return elements;
    }
}
