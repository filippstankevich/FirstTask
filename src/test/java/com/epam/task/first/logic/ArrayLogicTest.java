package com.epam.task.first.logic;

import org.junit.Assert;
import org.junit.Test;

import com.epam.task.first.entities.Array;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied(){
        //given
        Array array = new Array(1,3,2);

        //when
        int actual =  arrayLogic.findMax(array);

        //then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied(){
        //given
        Array array = new Array(-1,-3,-2);

        //when
        int actual =  arrayLogic.findMax(array);

        //then
        Assert.assertEquals(-1, actual);
    }

}
