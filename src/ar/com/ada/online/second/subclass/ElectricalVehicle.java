package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    private Integer potency;

    public ElectricalVehicle() {
    }

    public ElectricalVehicle(Integer potency) {
        this.potency = potency;

    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    @Override
    public String technicalSheet() {
        //defino una variable local para q mi metodo tenga un unico retorno//
        String technicalSheet = super.toString() + " Es un auto de ultima tecnologia";
        if (year < 2007) {
            technicalSheet = "No existe modelo para este año";
        }
            return technicalSheet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricalVehicle that = (ElectricalVehicle) o;
        return Objects.equals(potency, that.potency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), potency);
    }

    @Override
    public String toString() {
        return "ElectricalVehicle{" +
                "potency=" + potency +
                '}';
    }
}
