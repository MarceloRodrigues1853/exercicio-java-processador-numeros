package org.aula2.exercicios.ex6_precessador_de_numeros;
/*
Nível 2: O Contador de Pares
Problema: Peça um número inteiro positivo ao usuário (ex: 10).
Use um loop for para mostrar todos os números pares de 0 até o número digitado.

O desafio extra:
Além de mostrar os números, você deve criar uma variável chamada soma que vai guardando o valor de cada par encontrado.
Ao final, mostre o total dessa soma.

        Dica: 1. Comece o for em i = 0.
2. Use o if (i % 2 == 0) para saber se soma ou não.
        3. Crie int soma = 0; antes do loop para ela não "zerar" a cada volta.
 */


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== PROCESSADOR DE NÚMEROS === \n");

        //istancia a Class "ProcessadorNumeros" como Tipo e cria 1 novo Obejeto dela
        ProcessadorNumeros procNum = new ProcessadorNumeros();

        //istancia do Leitor
        LeitorConsole leitor = new LeitorConsole();

        //enterada de dados do usuário
        int numeroDigitado = leitor.lerInteiro(sc, "Digite 1 número positivo: ");

        //menu de escolha
        int opcao = leitor.lerInteiroNoIntervalo(sc, "Menu de escolha:\n " +
                "1 para PAR:\n " +
                "2 para IMPAR:\n",
                1, 2
        );


        // Declar a variável para o texto
        String tipoEscolhido = "";

        // Declar a variável usando a INTERFACE
        FiltroNumero minhaRegra = null;

        switch (opcao) {
            case 1 -> {
                minhaRegra = new FiltroPar();
                tipoEscolhido = "PARES";
            }
            case 2 -> {
                minhaRegra = new FiltroImpar();
                tipoEscolhido = "IMPARES";
            }
            default -> tipoEscolhido = "N/A";
        }



        List<Integer> numeros = procNum.filtrar(numeroDigitado, minhaRegra);

        //variavel que guarda e soma os numeros
        int somaTotal  = 0;

        //for-each para percorrer a list e separar os numeros
        for (Integer numero : numeros) {
            //faz a soma a cada volta do for e guarda seu valor
            somaTotal += numero;
        }

        // istancia do Obejeto Realtorio e seu construtor
        Relatorio relatorioFinal = new Relatorio("Marcelo", tipoEscolhido, somaTotal);


        // A exibição do resultado final
        System.out.println("\n=== RELATÓRIO DO SISTEMA ===\n");
        System.out.println("..............................!\n");
        System.out.printf("O usuário %s digitou o número %d, filtrou os %s e SOMA total deles é: %d\n",
                relatorioFinal.getNomeUsuario(),
                numeroDigitado,
                relatorioFinal.getTipoFiltro(),
                relatorioFinal.getResultado());

        sc.close();
    }
}
