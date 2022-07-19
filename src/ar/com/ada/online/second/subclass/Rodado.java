package ar.com.ada.online.second.subclass;


import java.util.Collection;

public class Rodado implements Comparable{
    

    private int numeroRuedas;
    private int velocidadMaxima;
    private String color;
    private boolean costo;

    public Rodado(int numeroRuedas, int velocidadMaxima, String color, boolean costo) {
        this.numeroRuedas = numeroRuedas;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.costo = costo;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
