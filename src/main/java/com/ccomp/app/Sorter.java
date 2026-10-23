package com.ccomp.app;

public class Sorter {
    public void bubbleSort(int[] vet) {
        if (vet == null || vet.length < 2) {
            return;
        }
        int n = vet.length;
        // Ajustado para manejar arreglos estándar con índice base 0
        for (int i = n; i >= 2; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }
}

