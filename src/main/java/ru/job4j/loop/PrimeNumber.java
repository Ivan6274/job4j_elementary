package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 1;
        for (int number = 3; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}