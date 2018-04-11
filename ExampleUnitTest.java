package com.example.a17120069.projeto1;

import org.junit.Test;

import java.util.Arrays;

import static com.example.a17120069.projeto1.MainActivity.Teste1.soma;
import static com.example.a17120069.projeto1.MainActivity.multiplica;
import static com.example.a17120069.projeto1.MainActivity.sort;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 3);
    }


    @Test
    public void somaTestCaso1() {
        int firstParam = 2;
        int secondParam = 3;
        int actual = soma( firstParam , secondParam );
        int expected = 5;
        assertEquals( expected, actual);
    }


    @Test
    public void multiplicaTestCaso1() {
        int firstParam = 2;
        int secondParam = 3;
        long actual = multiplica(firstParam,secondParam );
        long expected = 6;
        assertEquals( expected, actual);
    }

    @Test
    public void sortTestCaso1() {
        int[] firstParam = new int[] {5,4,3,2,1,0};
        int [] actual = sort(firstParam);
        int [] expected = {0,1,2,3,4,5};
        assertEquals( Arrays.toString(expected),Arrays.toString(actual));


    }




}

