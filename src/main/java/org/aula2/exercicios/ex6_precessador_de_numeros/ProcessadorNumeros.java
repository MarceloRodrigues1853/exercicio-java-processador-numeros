package org.aula2.exercicios.ex6_precessador_de_numeros;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorNumeros {

    //metodo que utiliza a "colection list" e passa 1 "limite" como parametro
    public List<Integer> filtrar(int limite, FiltroNumero regra){

        //istanciando a "colection list" e declarando como "listaFiltrada"
        List<Integer> listaFiltrada = new ArrayList<>();

        // for para percorrer de 0 até o número limite
        for (int i = 0; i <= limite; i++){
            //condição para filtrar números pares
            if (regra.atendeRegra(i)){
                listaFiltrada.add(i);
            }
        }
        return listaFiltrada;
    }
}
