package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.interfaces.Comunicacion;

public class Mural implements Comunicacion {

    public boolean esConPintura;
    public boolean esUnGraffiti;

    public Mural(boolean esConPintura, boolean esUnGraffiti) {
        this.esConPintura = esConPintura;
        this.esUnGraffiti = esUnGraffiti;
    }

    @Override
    public void comunicarse() {
        if (esConPintura == true ) {
            System.out.println(" Estoy pintando un mural con pintura sobre la Revolución Rusa");
        }else if (esUnGraffiti == true){
            System.out.println(" Estoy grafiteando unos garabatos locos anti capitalistas ");
        }
    }

    @Override
    public void expresarse() {
        System.out.println(" Estamos expresando nuestras ganas de revolución! ");

    }
}