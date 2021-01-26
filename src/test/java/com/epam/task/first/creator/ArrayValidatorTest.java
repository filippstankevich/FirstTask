package com.epam.task.first.creator;

import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    @Test
    public void testFValidateNormal(){
        //given
        ArrayValidator arrayValidator = new ArrayValidator();
        //when
        boolean answer = arrayValidator.validate("1 2 3");
        //then
        Assert.assertEquals(true, answer);
    }

    @Test
    public void testValidateIncorrect(){
        //given
        ArrayValidator arrayValidator = new ArrayValidator();
        //when
        boolean answer = arrayValidator.validate("1 23v 3");
        //then
        Assert.assertEquals(false, answer);
    }

    @Test
    public void testValidateEmpty(){
        //given
        ArrayValidator arrayValidator = new ArrayValidator();
        //when
        boolean answer = arrayValidator.validate("");
        //then
        Assert.assertEquals(false, answer);
    }

    @Test
    public void testValidateOnlySplitter(){
        //given
        ArrayValidator arrayValidator = new ArrayValidator();
        //when
        boolean answer = arrayValidator.validate("  ");
        //then
        Assert.assertEquals(false, answer);
    }

}
