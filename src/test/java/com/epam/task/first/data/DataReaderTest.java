package com.epam.task.first.data;


import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;



public class DataReaderTest {

    private final static String FILE_PATH = "./src/test/resources/input.txt";

    //private final static List<String> TEST_DATA = Arrays.asList("1 2 3", "3g 5 6", "3 4 23", "-1 4 -5");

    /*@Test
    public void testFindMaxWhenNegative() throws IOException {
        //given
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readFile(anyString())).thenReturn(TEST_DATA);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(-1, actual);
    }*/

    @Test
    public void testReadFileShouldReadFileAsListOfStrings() throws IOException {
        //given
        DataReader reader = new DataReader();
        List<String> exampleString = Arrays.asList("1 2 3", "2sdf 3 123", "  3453", "123 -2 1");
        //when
        List<String> listOfStrings = reader.readFile(FILE_PATH);
        //then
        Assert.assertEquals(exampleString, listOfStrings);
    }
}
