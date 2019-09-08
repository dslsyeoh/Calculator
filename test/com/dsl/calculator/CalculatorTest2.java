package com.dsl.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest2
{
    private Calculator calculator;

    @BeforeAll
    void initialize()
    {
        calculator = new Calculator();
    }

    @Test
    void test_mix_operations_1()
    {
        assertEquals(3, calculator.add(10, 5).subtract(5).multiply(3).divide(10).getTotal());
    }

    @Test
    void test_mix_operations_2()
    {
        assertEquals(3.9, calculator.add(10, 5).subtract(5).multiply(3).divide(10).getTotal());
    }

    @Test
    void test_mix_operations_3()
    {
        assertEquals(4.17, calculator.add(10, 5).subtract(5).multiply(3).divide(10).getTotal());
    }

    @Test
    void test_mix_operations_4()
    {
        assertEquals(500, calculator.add(0.83).subtract(5).add(10).divide(2).multiply(100).getTotal());
    }

    @Test
    void test_mix_operations_5()
    {
        assertEquals(0, calculator.divide(500).add(1).subtract(2).divide(1).getTotal());
    }

    @Test
    void test_divide_by_zero()
    {
        assertTrue(Double.isNaN(calculator.divide(500).add(1).subtract(1).divide(0).getTotal()));
    }
}
