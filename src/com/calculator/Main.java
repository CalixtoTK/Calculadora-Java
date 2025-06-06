package com.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        do {
            exibirMenu();
            try {
                System.out.print("Escolha uma opção: ");
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1: // Adição
                        System.out.print("Digite o primeiro número: ");
                        double ad1 = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        double ad2 = scanner.nextDouble();
                        System.out.println("Resultado: " + calc.somar(ad1, ad2));
                        break;
                    case 2: // Subtração
                        System.out.print("Digite o primeiro número: ");
                        double sub1 = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        double sub2 = scanner.nextDouble();
                        System.out.println("Resultado: " + calc.subtrair(sub1, sub2));
                        break;
                    case 3: // Multiplicação
                        System.out.print("Digite o primeiro número: ");
                        double multi1 = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        double multi2 = scanner.nextDouble();
                        System.out.println("Resultado: " + calc.multiplicar(multi1, multi2));
                        break;
                    case 4: // Divisão
                        System.out.print("Digite o dividendo: ");
                        double divN1 = scanner.nextDouble();
                        System.out.print("Digite o divisor: ");
                        double divN2 = scanner.nextDouble();
                        System.out.println("Resultado: " + calc.dividir(divN1, divN2));
                        break;
                    case 5: // Exponenciação
                        System.out.print("Digite a base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Digite o expoente: ");
                        double expoente = scanner.nextDouble();
                        System.out.println("Resultado: " + calc.potencia(base, expoente));
                        break;
                    case 6: // Divisão Inteira
                        System.out.print("Digite o dividendo (inteiro): ");
                        int di1 = scanner.nextInt();
                        System.out.print("Digite o divisor (inteiro): ");
                        int di2 = scanner.nextInt();
                        System.out.println("Resultado: " + calc.calcularDivisaoInteira(di1, di2));
                        break;
                    case 7: // Resto da Divisão
                        System.out.print("Digite o dividendo (inteiro): ");
                        int rd1 = scanner.nextInt();
                        System.out.print("Digite o divisor (inteiro): ");
                        int rd2 = scanner.nextInt();
                        System.out.println("Resultado: " + calc.calcularRestoDivisao(rd1, rd2));
                        break;
                    case 8: // Fatorial
                        System.out.print("Digite um número inteiro não negativo: ");
                        int fatN = scanner.nextInt();
                        System.out.println("Resultado: " + calc.calcularFatorial(fatN));
                        break;
                    case 9: // Arranjos A(n,k)
                        System.out.print("Digite o valor de n (inteiro): ");
                        int arrN = scanner.nextInt();
                        System.out.print("Digite o valor de k (inteiro): ");
                        int arrK = scanner.nextInt();
                        System.out.println("Resultado: " + calc.calcularArranjo(arrN, arrK));
                        break;
                    case 10: // Permutações P(n)
                        System.out.print("Digite o valor de n (inteiro não negativo): ");
                        int permN = scanner.nextInt();
                        System.out.println("Resultado: " + calc.calcularPermutacao(permN));
                        break;
                    case 11: // Piso
                        System.out.print("Digite um número: ");
                        double pisoN = scanner.nextDouble();
                        System.out.println("Resultado: " + calc.calcularPiso(pisoN));
                        break;
                    case 12: // Teto
                        System.out.print("Digite um número: ");
                        double tetoN = scanner.nextDouble();
                        System.out.println("Resultado: " + calc.calcularTeto(tetoN));
                        break;
                    case 13: // Raiz N-ésima
                        System.out.print("Digite o radicando: ");
                        double rad = scanner.nextDouble();
                        System.out.print("Digite o índice da raiz (inteiro diferente de zero): ");
                        int ind = scanner.nextInt();
                        System.out.println("Resultado: " + calc.calcularRaizNesima(rad, ind));
                        break;
                    case 14: // Validar Número Primo
                        System.out.print("Digite um número inteiro: ");
                        int primoN = scanner.nextInt();
                        System.out.println("É primo? " + (calc.verificarPrimo(primoN) ? "Sim" : "Não"));
                        break;
                    case 15: // Validar Quadrado Perfeito
                        System.out.print("Digite um número inteiro: ");
                        int quadN = scanner.nextInt();
                        System.out.println("É quadrado perfeito? " + (calc.verificarQuadradoPerfeito(quadN) ? "Sim" : "Não"));
                        break;
                    case 0:
                        System.out.println("Saindo da calculadora.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Erro: Entrada inválida. Por favor, insira o tipo de dado correto.");
                scanner.nextLine(); // Limpar o buffer do scanner
                escolha = -1; // Forçar a continuação do ‘loop’
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.err.println(e.getMessage());
                 escolha = -1; // Forçar a continuação do 'loop'
            } finally {
                 if (escolha != 0) {
                    System.out.println("------------------------------------");
                 }
            }

        } while (escolha != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n calculadora OOP - Escolha uma Operação:");
        System.out.println("1. Adição (a + b)");
        System.out.println("2. Subtração (a - b)");
        System.out.println("3. Multiplicação (a * b)");
        System.out.println("4. Divisão (a / b)");
        System.out.println("5. Exponenciação (base ^ expoente)");
        System.out.println("6. Divisão Inteira (a // b)");
        System.out.println("7. Resto da Divisão (a % b)");
        System.out.println("8. Fatorial (n!)");
        System.out.println("9. Arranjos (A(n, k))");
        System.out.println("10. Permutações (P(n))");
        System.out.println("11. Piso (floor(x))");
        System.out.println("12. Teto (ceil(x))");
        System.out.println("13. Raiz N-ésima (radicando ^ (1/índice))");
        System.out.println("14. Validar Número Primo");
        System.out.println("15. Validar Quadrado Perfeito");
        System.out.println("0. Sair");
    }
}