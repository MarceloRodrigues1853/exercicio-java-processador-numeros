package org.aula2.exercicios.ex6_precessador_de_numeros;

public class FiltroImpar implements FiltroNumero{
    @Override
    public boolean atendeRegra(int numero) {
           return numero % 2 != 0;
    }
}
