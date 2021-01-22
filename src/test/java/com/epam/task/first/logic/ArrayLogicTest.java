package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    //findMax
    @Test
    public void testFindMaxWhenPositive(){
        //given
        Array array = new Array(1, 2, 3);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindMaxWhenNegative(){
        //given
        Array array = new Array(-1, -2, -3);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testFindMaxWhenInMiddle(){
        //given
        Array array = new Array(-1, 2, -3);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(2, actual);
    }

    //findMin
    @Test
    public void testFindMinWhenPositive(){
        //given
        Array array = new Array(1, 2, 3);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindMinWhenNegative(){
        //given
        Array array = new Array(-1, -2, -3);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testFindMinWhenInMiddle(){
        //given
        Array array = new Array(-1, 2, -3);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(2, actual);
    }

    //replaceWithZeroEachNegative
    @Test
    public void testReplaceWithZeroEachNegativeWithoutNegatives(){
        //given
        Array array = new Array(1, 2, 3);
        //when
        List<Integer> actual = arrayLogic.replaceWithZeroEachNegative(array);
        //then
        Assert.assertEquals(Arrays.asList(1, 2, 3), actual);
    }

    @Test
    public void testReplaceWithZeroEachNegativeWithoutPositives(){
        //given
        Array array = new Array(-1, -2, -3);
        //when
        List<Integer> actual = arrayLogic.replaceWithZeroEachNegative(array);
        //then
        Assert.assertEquals(Arrays.asList(0, 0, 0), actual);
    }

    @Test
    public void testReplaceWithZeroEachNegativeWithZeros(){
        //given
        Array array = new Array(-1, -4, 0, 6, -4);
        //when
        List<Integer> actual = arrayLogic.replaceWithZeroEachNegative(array);
        //then
        Assert.assertEquals(Arrays.asList(0, 0, 0, 6, 0), actual);
    }

    //findSum
    @Test
    public void testFindSumWhenPositive(){
        //given
        Array array = new Array(1, 2, 3);
        //when
        int actual = arrayLogic.findSum(array);
        //then
        Assert.assertEquals(6, actual);
    }

    @Test
    public void testFindSumWhenNegative(){
        //given
        Array array = new Array(-1, -2, -3);
        //when
        int actual = arrayLogic.findSum(array);
        //then
        Assert.assertEquals(-6, actual);
    }

    @Test
    public void testFindSumWithDifferentNumbers(){
        //given
        Array array = new Array(-1, 2, -3);
        //when
        int actual = arrayLogic.findSum(array);
        //then
        Assert.assertEquals(-2, actual);
    }

    //findAvg
    @Test
    public void testFindAvgWhenPositive(){
        //given
        Array array = new Array(1, 2, 3);
        //when
        double actual = arrayLogic.findAvg(array);
        //then
        Assert.assertEquals(2, actual, 0.01);
    }

    @Test
    public void testFindAvgWhenNegative(){
        //given
        Array array = new Array(-1, -2, -3);
        //when
        double actual = arrayLogic.findAvg(array);
        //then
        Assert.assertEquals(-2, actual, 0.01);
    }

    @Test
    public void testFindAvgWithDifferentNumbers(){
        //given
        Array array = new Array(-1, 2, -3);
        //when
        double actual = arrayLogic.findAvg(array);
        //then
        Assert.assertEquals(-0.67, actual, 0.01);
    }


    //findCountOfPositives
    @Test
    public void testFindCountOfPositiveWhenOnlyPositive(){
        //given
        Array array = new Array(1, 2, 3);
        //when
        int actual = arrayLogic.findPositives(array);
        //then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindCountOfPositiveWhenOnlyNegative(){
        //given
        Array array = new Array(-1, -2, -3);
        //when
        int actual = arrayLogic.findPositives(array);
        //then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testFindCountOfPositiveWhenDifferentNumbers(){
        //given
        Array array = new Array(-1, 2, -3);
        //when
        int actual = arrayLogic.findPositives(array);
        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testFindCountOfPositivesWithZero(){
        //given
        Array array = new Array(-1, 2, -3, 0, -5);
        //when
        int actual = arrayLogic.findPositives(array);
        //then
        Assert.assertEquals(1, actual);
    }

    //findCountOfNegatives
    @Test
    public void testFindCountOfNegativesWhenOnlyPositive(){
        //given
        Array array = new Array(1, 2, 3);
        //when
        int actual = arrayLogic.findNegatives(array);
        //then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testFindCountOfNegativesWhenOnlyNegative(){
        //given
        Array array = new Array(-1, -2, -3);
        //when
        int actual = arrayLogic.findNegatives(array);
        //then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindCountOfNegativesWhenDifferentNumbers(){
        //given
        Array array = new Array(-1, 2, -3);
        //when
        int actual = arrayLogic.findNegatives(array);
        //then
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testFindCountOfNegativesWithZero(){
        //given
        Array array = new Array(-1, 2, -3, 0, -5);
        //when
        int actual = arrayLogic.findNegatives(array);
        //then
        Assert.assertEquals(3, actual);
    }

}
