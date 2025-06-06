package com.calculator.operations;

// Arranjo simples: A(n, k) = n! / (n-k)! = n * (n-1) * ... * (n-k+1)
public class Arranjo {
    public long calcular(int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("n e k devem ser não negativos para arranjos.");
        }
        if (k > n) {
            throw new IllegalArgumentException("k não pode ser maior que n em arranjos (A(n,k)).");
        }

        long resultado = 1;
        for (int i = 0; i < k; i++) {
            // Checagem de estouro antes da multiplicação
            if (n - i == 0 && i < k -1) { // Evita multiplicar por 0 se não for o último termo e k > n
                return 0; // Caso A(5,6) por exemplo, embora a validação k > n já cubra
            }
            if ( (n-i) != 0 && resultado > Long.MAX_VALUE / (n - i) && resultado != 0) {
                 throw new ArithmeticException("Estouro de resultado durante o cálculo do arranjo.");
            }
            resultado *= (n - i);
        }
        return resultado;
    }
}