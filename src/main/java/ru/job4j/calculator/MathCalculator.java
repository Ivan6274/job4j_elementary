package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumOfSubsAndDiv(double first, double second) {
        return sum(division(first, second), subtraction(first, second));
    }

    public static double sumAll(double first, double second) {
        return sum(sum(multiply(first, second), sum(first, second)),
                sum(division(first, second), subtraction(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOfSubsAndDiv(32, 6));
        System.out.println("Результат расчета равен: " + sumAll(3, 11));

    }
}