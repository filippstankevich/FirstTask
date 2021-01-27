package com.epam.task.first.data;

import com.epam.task.first.entities.Array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    private String inputFileName;

    public DataReader() {}

    public List<String> readFile(String inputFileName) throws IOException {
        List<String> stringList = new ArrayList<>();
        try {
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            String line;
            while ((line = reader.readLine()) != null) {
                stringList.add(line);
            }
        }
        catch (DataException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public String getInputFileName() {
        return inputFileName;
    }
}
