package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayParser {

    public ArrayParser() {}

    public Array<Integer> parseString(String line){
        String[] numbers = line.split(" ");
        List<Integer> arrayInt = new ArrayList<>();
        for (String number: numbers) {
            arrayInt.add(Integer.valueOf(number));
        }
        Array<Integer> array = new Array(arrayInt);
        return array;
    }
}
