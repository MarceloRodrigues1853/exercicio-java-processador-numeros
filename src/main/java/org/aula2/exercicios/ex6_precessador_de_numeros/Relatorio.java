package org.aula2.exercicios.ex6_precessador_de_numeros;

public class Relatorio {
    private String nomeUsuario;
    private String tipoFiltro;
    private int resultado;

    public Relatorio(String nomeUsuario, String tipoFiltro, int resultado) {
        this.nomeUsuario = nomeUsuario;
        this.tipoFiltro = tipoFiltro;
        this.resultado = resultado;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getTipoFiltro() {
        return tipoFiltro;
    }

    public int getResultado() {
        return resultado;
    }
}
