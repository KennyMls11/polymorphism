package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.interfaces.Comunicacion;

public class Hoja implements Comunicacion {

    public String tipoDeHoja;
    public boolean esReciclado;

    public Hoja(String tipoDeHoja, boolean esReciclado) {
        this.tipoDeHoja = tipoDeHoja;
        this.esReciclado = esReciclado;
    }

    @Override
    public void comunicarse() {
        if (esReciclado== true){
            System.out.println(" Me estoy comunicando con el mundo de manera amable con el medio ambiente");
        } else {
            System.out.println("Deberia cuidar el planeta y optar por un medio eco-friendly");
        }

    }

    @Override
    public void expresarse() {
        System.out.println(" Voy a comprar hojas " + tipoDeHoja + " para comenzar mi nuevo libro ");

    }
}
