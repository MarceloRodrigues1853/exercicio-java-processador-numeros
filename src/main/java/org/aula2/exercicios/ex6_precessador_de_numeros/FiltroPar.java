package org.aula2.exercicios.ex6_precessador_de_numeros;

public class FiltroPar implements  FiltroNumero{
    @Override
    public boolean atendeRegra(int numero) {
            return numero % 2 == 0;
    }
}
