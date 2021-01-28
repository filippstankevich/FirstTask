package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Array<T> {

    private final List<T> elements;

    public Array(T... elements){
        this.elements = new ArrayList<T>();
        this.elements.addAll(Arrays.asList(elements));
    }

    public Array(List<T> elements){
        this.elements = elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Array)) return false;
        Array<?> array = (Array<?>) o;
        return Objects.equals(getElements(), array.getElements());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getElements());
    }

    public List<T> getElements() {
        return elements;
    }
}
