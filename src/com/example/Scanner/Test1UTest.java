package com.example.Scanner;


import org.junit.Test;
import static org.junit.Assert.*;

public class Test1UTest {
    @Test
    public void Test(){
        String sum = Test1.sumTwoNumbers("111","123");
        assertEquals("234",sum);
    }
    @Test
    public void Test2(){
        String sum = Test1.sumTwoNumbers("1110000000000","123");
        assertEquals("1110000000123",sum);
    }
}
