package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortArrayLenght5() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayLenght8() {
        int[] data = new int[]{0, 4, -1, 23, 5, 14, 2, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-1, 0, 2, 4, 5, 6, 14, 23};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayLenght3() {
        int[] data = new int[]{-4, 1, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-4, 0, 1};
        assertThat(result).containsExactly(expected);
    }
}