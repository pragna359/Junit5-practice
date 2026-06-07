package com.telusuko.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @BeforeEach
    void init() {
        System.out.println("before test");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    void test2() {
        System.out.println("test2");
    }
}