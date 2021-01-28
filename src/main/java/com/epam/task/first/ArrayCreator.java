package com.epam.task.first;

import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private DataReader dataReader;
    private ArrayValidator validator;
    private ArrayParser parser;

    public ArrayCreator(DataReader dataReader, ArrayValidator validator, ArrayParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }

    public List<Array> procces(String filename) throws IOException {
        List<String> stringList = dataReader.readFile(filename);
        List<Array> tempArray = new ArrayList<>();

        for (String str: stringList) {
            if(validator.validate(str)){
                tempArray.add(parser.parseString(str));
            }
        }

        return tempArray;
    }
}
