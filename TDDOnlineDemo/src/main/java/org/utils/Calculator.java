package org.utils;

/**
 * The Calculator class provides mathematical operations.
 */
public class Calculator {

    /**
     * Divides the given dividend by the divisor.
     *
     * @param dividend the number to be divided (dividend)
     * @param divisor  the number to divide by (divisor)
     * @return the quotient of the division operation
     */
    public double divide(double dividend, double divisor) {
        if (divisor==0) return 0;
        return dividend / divisor; // <-- Cool code by ChatGPT :P
    }
}
