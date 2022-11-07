package com.example.androidcalculator;

import org.junit.Test;

import static  org.junit.Assert.*;

import javax.script.ScriptException;

public class EvaluatorTest {

    @Test
    public void evaluate_subtraction() throws ScriptException {
        Evaluator evaluator = new Evaluator();
        double actual = evaluator.evaluate("5-2").doubleValue();
        double expected = 4.0;
        assertEquals("Subtraction failed",expected,actual, 0.0001);
    }

    @Test
    public void evaluate_multiplication() throws ScriptException {
        Evaluator evaluator = new Evaluator();
        double actual = evaluator.evaluate("2*5").doubleValue();
        double expected = 10.0;
        assertEquals("Multiplication failed",expected,actual, 0.0001);
    }
}