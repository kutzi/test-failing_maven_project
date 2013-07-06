package com.test;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DefaultTest {

    
    public void shouldSucceed() {
    }
    
    public void shouldFail() {
        Assert.fail("Boom, there you go!");
    }
    
    public void shouldFailRandomly() {
        if (new Random().nextBoolean()) {
            Assert.fail("Boom, there you go!");
        }
    }
    
    public void shouldFailRandomly2() {
        if (new Random().nextBoolean()) {
            Assert.fail("Boom, there you go!");
        }
    }
    
    public void shouldFailRandomly3() {
        if (new Random().nextBoolean()) {
            Assert.fail("Boom, there you go!");
        }
    }
    
}
