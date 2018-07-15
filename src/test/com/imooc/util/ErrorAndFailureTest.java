package com.imooc.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class ErrorAndFailureTest {

    @Test
    public void add() {
        assertEquals(5,new Calculate().add(3,3));
    }


}