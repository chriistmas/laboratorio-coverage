package com.ccomp.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SorterTest {
    private Sorter sorter;

    @BeforeEach
    void setUp() {
        sorter = new Sorter();
    }

    @Test
    @DisplayName("CP1: Arreglo con menos de dos elementos")
    void testArrayMenorADos() {
        int[] input = {5};
        int[] expected = {5};
        sorter.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("CP2: Arreglo ya ordenado en forma ascendente")
    void testArrayYaOrdenado() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        sorter.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("CP3 & CP4: Arreglo completamente desordenado")
    void testArrayDesordenado() {
        int[] input = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        sorter.bubbleSort(input);
        assertArrayEquals(expected, input);
    }
}

