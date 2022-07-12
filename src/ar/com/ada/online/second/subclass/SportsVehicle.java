package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.superclass.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {
    private Integer rpm;

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle() {
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm= rpm;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    @Override
    public String technicalSheet() {
        String technicalSheet = toString();
        if (rpm <= 50) {
            technicalSheet = technicalSheet + " El auto no sirve para nada";
        } else if (rpm > 51 & rpm <= 300) {
            technicalSheet = technicalSheet + "Con este auto puedes desafiar en cualquier pista ";
        } else if (rpm > 300 & rpm <= 600) {
            technicalSheet = technicalSheet + "Si tienes este auto te debes considerar para nascar";
        } else if (rpm > 600) {
            technicalSheet = technicalSheet + "Eres parte de rapidos y furiosos?! ";}

            return technicalSheet;
    }

    @Override
    public String toString() {
        return "SportsVehicle{" +
                "rpm=" + rpm +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportsVehicle that = (SportsVehicle) o;
        return Objects.equals(rpm, that.rpm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rpm);
    }
}
