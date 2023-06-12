package org.main;

import org.utils.Calculator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        double num = calc.divide(10,4);
        System.out.println(num);
    }
}