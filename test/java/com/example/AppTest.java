package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testMain() {
        App app = new App();
        String result = app.main();
        Assert.assertEquals("Hello, World!", result);
    }
}