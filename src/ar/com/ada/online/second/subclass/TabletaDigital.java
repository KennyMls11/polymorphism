package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.interfaces.Comunicacion;

public class TabletaDigital implements Comunicacion {
    public String marca;
    public int añoDeFabricacion;

    public TabletaDigital(String marca, int añoDeFabricacion) {
        this.marca = marca;
        this.añoDeFabricacion = añoDeFabricacion;
    }

    @Override
    public void comunicarse() {
        System.out.println(" Voy a hacer unos bocetos de mi nueva casa en mi tableta " + marca + " " + añoDeFabricacion );
    }

    @Override
    public void expresarse() {
        System.out.println(" Para expresar mis ganas de ser un adulto independiente! ");
    }
}

