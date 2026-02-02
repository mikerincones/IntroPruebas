package org.sergiolozanoprofe.service;

import org.junit.jupiter.api.Test;
import org.sergiolozanoprofe.model.OperationType;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calc = new CalculatorService();

    @Test
    void computeAdd() {
        double resultado = calc.compute(5, OperationType.ADD, 3);
        assertThat(resultado).isEqualTo(8);

    }

    @Test
    void computeSubtract() {
        double resultado = calc.compute(5, OperationType.SUBTRACT, 3);
        assertThat(resultado).isEqualTo(2);
    }

    @Test
    void computeMultiply() {
        double resultado = calc.compute(5, OperationType.MULTIPLY, 3);
        assertThat(resultado).isEqualTo(15);
    }

    @Test
    void computeDivide() {
        double resultado = calc.compute(6, OperationType.DIVIDE, 3);
        assertThat(resultado).isEqualTo(2);
    }

    @Test
    void add() {
        assertEquals(4, calc.add(2, 2));
    }

    @Test
        // Comprobación de que suma cuando se introducen tambien numeros negativos
    void addNegativos() {
        assertEquals(-8, calc.add(-6, -2));
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
    void multiplyNegativos() {
        assertEquals(4, calc.multiply(-2, -2));
        assertEquals(-4, calc.multiply(-2, 2));
    }

    @Test
    void divide() {
        assertEquals(4, calc.divide(8, 2));
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