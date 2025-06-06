package com.calculator.operations;

public class ValidadorQuadradoPerfeito {
    public boolean ehQuadradoPerfeito(int numero) {
        if (numero < 0) {
            return false;
        }
        if (numero == 0) {
            return true;
        }
        int raiz = (int) Math.sqrt(numero);
        return raiz * raiz == numero;
    }
}