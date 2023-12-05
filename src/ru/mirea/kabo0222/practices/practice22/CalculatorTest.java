package ru.mirea.kabo0222.practices.practice22;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void OnePlusTwoEqualsThree()
    {
        var calculator = new Calculator();
        assertEquals(3, calculator.calculate("1 2 +"));
    }
    @Test
    public void OnePlusTwoAndTenDivTwoEqualsEight()
    {
        var calculator = new Calculator();
        assertEquals(8, calculator.calculate("1 2 + 10 2 / +"));
    }
    @Test
    public void NumberEqualsNumber()
    {
        var calculator = new Calculator();
        assertEquals(123, calculator.calculate("123"));
    }
    @Test
    public void NumberAndOperationEqualsZero()
    {
        var calculator = new Calculator();
        assertEquals(0, calculator.calculate("123 +"));
    }
    @Test
    public void EmptyStringEqualsZero()
    {
        var calculator = new Calculator();
        assertEquals(0, calculator.calculate(""));
    }
    @Test
    public void DivisionByZeroEqualsZero()
    {
        var calculator = new Calculator();
        assertEquals(0, calculator.calculate("1 0 /"));
    }
}