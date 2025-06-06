package com.calculator;

import com.calculator.operations.*;

public class Calculadora {

    private final Adicao adicao = new Adicao();
    private final Subtracao subtracao = new Subtracao();
    private final Multiplicacao multiplicacao = new Multiplicacao();
    private final Divisao divisao = new Divisao();
    private final Exponenciacao exponenciacao = new Exponenciacao();
    private final DivisaoInteira divisaoInteira = new DivisaoInteira();
    private final RestoDivisao restoDivisao = new RestoDivisao();
    private final Fatorial fatorial = new Fatorial();
    private final Arranjo arranjo = new Arranjo();
    private final Permutacao permutacao = new Permutacao();
    private final Piso piso = new Piso();
    private final Teto teto = new Teto();
    private final RaizNesima raizNesima = new RaizNesima();
    private final ValidadorNumeroPrimo validadorNumeroPrimo = new ValidadorNumeroPrimo();
    private final ValidadorQuadradoPerfeito validadorQuadradoPerfeito = new ValidadorQuadradoPerfeito();

    public double somar(double a, double b) {
        return adicao.calcular(a, b);
    }

    public double subtrair(double a, double b) {
        return subtracao.calcular(a, b);
    }

    public double multiplicar(double a, double b) {
        return multiplicacao.calcular(a, b);
    }

    public double dividir(double dividendo, double divisor) {
        return divisao.calcular(dividendo, divisor);
    }

    public double potencia(double base, double expoente) {
        return exponenciacao.calcular(base, expoente);
    }

    public int calcularDivisaoInteira(int dividendo, int divisor) {
        return divisaoInteira.calcular(dividendo, divisor);
    }

    public int calcularRestoDivisao(int dividendo, int divisor) {
        return restoDivisao.calcular(dividendo, divisor);
    }

    public long calcularFatorial(int n) {
        return fatorial.calcular(n);
    }

    public long calcularArranjo(int n, int k) {
        return arranjo.calcular(n, k);
    }

    public long calcularPermutacao(int n) {
        return permutacao.calcular(n);
    }

    public double calcularPiso(double numero) {
        return piso.calcular(numero);
    }

    public double calcularTeto(double numero) {
        return teto.calcular(numero);
    }

    public double calcularRaizNesima(double radicando, int indice) {
        return raizNesima.calcular(radicando, indice);
    }

    public boolean verificarPrimo(int numero) {
        return validadorNumeroPrimo.ehPrimo(numero);
    }

    public boolean verificarQuadradoPerfeito(int numero) {
        return validadorQuadradoPerfeito.ehQuadradoPerfeito(numero);
    }
}