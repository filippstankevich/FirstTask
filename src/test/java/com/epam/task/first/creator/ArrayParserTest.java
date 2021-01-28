package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArrayParserTest {

    private ArrayParser arrayParser = new ArrayParser();
    @Test
    public void testParserNormal(){
        //given
        Array<Integer> array = new Array<Integer>(1, 2, 3);
        String line= "1 2 3";

        //when
        Array answer = arrayParser.parseString(line);
        //then
        Assert.assertEquals(array, answer);
    }
}
