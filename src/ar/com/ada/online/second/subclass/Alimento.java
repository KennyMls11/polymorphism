package ar.com.ada.online.second.subclass;

public class Alimento implements Comparable{

    private String name;
    private double costo;

    public Alimento(String name, double costo) {
        this.name = name;
        this.costo = costo;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
