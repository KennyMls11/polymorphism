package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Objects;

public class TruckVehicle extends Vehicle {
    private Integer maxLoad;

    public TruckVehicle() {
    }

    public TruckVehicle(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public TruckVehicle(String brand, String model, Integer year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String technicalSheet() {
        String technicalSheet = toString();
        if (maxLoad < 100) {
            technicalSheet = technicalSheet + "Para iniciar un negocio";
        } else {
            technicalSheet = technicalSheet + "carga larga";
        } return technicalSheet;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxLoad=" + maxLoad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TruckVehicle truck = (TruckVehicle) o;
        return Objects.equals(maxLoad, truck.maxLoad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxLoad);
    }
}
