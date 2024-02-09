package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void TestAppMain() {
        String[] args = {};
        int result = App.main(args);
        Assert.assertEquals(0, result);
    }
}