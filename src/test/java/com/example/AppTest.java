package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void TestAppMain() {
        String[] args = {}; // Create an empty string array
        int result = App.main(args); // Pass the empty string array as an argument
        Assert.assertEquals(0, result);
    }
}