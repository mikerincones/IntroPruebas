package org.sergiolozanoprofe.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calc = new CalculatorService();

    @Test
    void compute() {
    }

    @Test
    void add() {
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    void subtract() {
        assertEquals(4, calc.subtract(6, 2));
    }

    @Test
    void subtractNegativos() {
        assertEquals(-6, calc.subtract(-8, -2));
    }

    @Test
    void multiply() {
        assertEquals(4, calc.multiply(2, 2));
    }

    @Test
    void divideCero() {
        double resultado = 2;
        try {
            assertEquals(resultado, calc.divide(4, 0));
        } catch (ArithmeticException e) {
            System.out.println("ERROR");
        }
    }
}