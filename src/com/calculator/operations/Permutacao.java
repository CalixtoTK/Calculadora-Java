package com.calculator.operations;

public class Permutacao {
    private final Fatorial fatorialCalculator;

    public Permutacao() {
        this.fatorialCalculator = new Fatorial();
    }

    public long calcular(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Permutação não é definida para um número negativo de elementos.");
        }
        // Reutiliza a lógica (e validações de overflow) da classe Fatorial
        return fatorialCalculator.calcular(n);
    }
}