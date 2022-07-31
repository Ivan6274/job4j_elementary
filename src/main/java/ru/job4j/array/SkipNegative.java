package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int sell = 0; sell < array[row].length; sell++) {
                if (array[row][sell] < 0) {
                    array[row][sell] = 0;
                }
            }
        }
        return array;
    }
}