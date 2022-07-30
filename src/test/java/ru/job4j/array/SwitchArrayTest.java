package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {11, 3, -3, 4, 13, -25, 0};
        int source = 1;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {11, 13, -3, 4, 3, -25, 0};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwapVarMoreThanArrayLenght() {
        int[] input = {11, 3, -3, 4, 13, -25, 0, 55};
        int source = 11;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {11, 3, -3, 4, 13, -25, 0, 55};
        assertThat(result).containsExactly(expected);
    }
}