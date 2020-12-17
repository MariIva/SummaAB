package com.example.summaab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(5, 2 + 2);
    }
     @Test
    public void add_test(){
        assertEquals(6, MainActivity.add(2,4));
     }
}