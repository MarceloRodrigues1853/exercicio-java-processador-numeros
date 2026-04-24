package org.aula2.exercicios.ex6_precessador_de_numeros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorConsole {
    // Este método centraliza toda aquela lógica do while/try-catch
    public int lerInteiro(Scanner sc, String mensagem) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.println(mensagem);
                numero = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.err.println("❌ Erro: Digite um número inteiro válido!\n");
                sc.next(); // Limpa o buffer
            }
        }
        return numero;
    }

    // Este método aceita um valor mínimo e um máximo (ex: 1 e 2)
    public int lerInteiroNoIntervalo(Scanner sc, String mensagem, int min, int max) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            // Usamos o método já criado para garantir que seja um número
            numero = lerInteiro(sc, mensagem);

            // Agora checamos se o número está dentro do que o menu permite
            if (numero >= min && numero <= max) {
                valido = true;
            } else {
                System.err.printf("❌ Erro: Por favor, escolha uma opção entre %d e %d.\n", min, max);
            }
        }
        return numero;
    }
}
