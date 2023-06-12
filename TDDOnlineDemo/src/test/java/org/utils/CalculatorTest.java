package org.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "8,4,2", // 8 = dividend, 4 = divisor, 2 = expected
            "5,0,0"
    })
    void divide(double dividend, double divisor, double expected) {
        // Divisioner kraschar alltid vid 0 division och orsakar DivisionByZero error

        // Arrange
        Calculator sut = new Calculator();

        // Act
        double actual = sut.divide(dividend,divisor);

        // Assert
        assertEquals(expected,actual);
    }
}