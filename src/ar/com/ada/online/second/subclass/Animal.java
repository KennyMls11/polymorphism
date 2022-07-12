package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.interfaces.LivingBeing;

public class Animal implements LivingBeing {

    public String type;
    public  String habitat;

    @Override
    public void eat(String foodName) {
        System.out.println( "Hola soy una persona y estoy comiendo" + foodName);

    }


    @Override
    public void sleep() {
        System.out.println( "Hola soy una persona y estoy durmiendo");

    }

    @Override
    public void communicate() {
        System.out.println( "Hola soy una persona y me estoy comunicando");

    }
}
