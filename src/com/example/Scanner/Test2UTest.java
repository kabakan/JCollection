package com.example.Scanner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test2UTest {
    @Test
    public void Test(){
        int result = Test2.sumNumber(1003);

        assertEquals(4,result);
    }

    @Test
    public void Test2(){
        int result = Test2.sumNumber(123);

        assertEquals(6,result);
    }
}
