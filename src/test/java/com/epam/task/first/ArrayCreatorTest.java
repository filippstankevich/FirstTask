package com.epam.task.first;

import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.epam.task.first.entities.Array;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static List<String> TEST_DATA = Arrays.asList("1 2 3", "3g 5 6", "3 4 23", "-1 4 -5");
    private ArrayValidator validator = new ArrayValidator();
    private ArrayParser parser = new ArrayParser();


    @Test
    public void testFindMaxWhenNegative() throws IOException {
        //given
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readFile(anyString())).thenReturn(TEST_DATA);
        ArrayCreator creator = new ArrayCreator(reader, validator, parser);
        List<Array> arrayList = new ArrayList<>();
        Array<Integer> tempIntArray = new Array<Integer>(1, 2, 3);
        arrayList.add(tempIntArray);
        tempIntArray = new Array<Integer>(3, 4, 23);
        arrayList.add(tempIntArray);
        tempIntArray = new Array<Integer>(-1, 4, -5);
        arrayList.add(tempIntArray);


        //when
        List<Array> actual = creator.procces("input.txt");
        //then

        Assert.assertEquals(arrayList, actual);
    }
}
