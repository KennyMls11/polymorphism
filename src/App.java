import ar.com.ada.online.second.interfaces.Comunicacion;
import ar.com.ada.online.second.interfaces.LivingBeing;
import ar.com.ada.online.second.subclass.*;

;import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Comunicacion> mediosDeExpresion = new ArrayList<>();

        mediosDeExpresion.add(new Lienzo(" Lino ", 25));
        mediosDeExpresion.add(new Mural(true, false));
        mediosDeExpresion.add(new Hoja("A4", true));
        mediosDeExpresion.add(new TabletaDigital("Ipad", 2021));

        for (int i = 0; i < mediosDeExpresion.size(); i++) {
            mediosDeExpresion.get(i).comunicarse();
            mediosDeExpresion.get(i).expresarse();
        }
    }
}
       /*List<LivingBeing> livingBeings= new ArrayList<>();
        livingBeings.add(new Persona());
        livingBeings.add(new Animal());

        for (int i= 0; i < livingBeings.size(); i++){
            livingBeings.get(i).eat("pan");
            livingBeings.get(i).sleep();
            livingBeings.get(i).communicate();

        }
    }


}
    /*
    public static final void main(String[] args) {
        Animal[] animals= new Animal [4];
        animals [0]= new Canine(4,8,"Perro","grande", "bulldog");
        animals [1]= new Wolf("Amazonas");
        animals [2]= new Wolf(4,23,"Largo","grande","pelolargo","selva");

    }

    }
       /* Vehicle [] vehicles= new Vehicle[12];
        vehicles [0]= new Vehicle("Mazda","Ctres", 2016);
        vehicles [1]= new Vehicle("Mazda","Ctres", 2016);
        vehicles [2] = new Vehicle("Mazda","Ctres", 2016);
        vehicles [3]= new ElectricalVehicle ("mazda","c3",2004,54);
        vehicles [4]= new ElectricalVehicle ("aveo","c3",1993,54);
        vehicles [5]= new ElectricalVehicle("renauld","kwid", 2017,54);
        vehicles [6]= new SportsVehicle ("mercedez","bens", 2022,2544);
        vehicles [7]= new SportsVehicle ("mercedez","bens", 2007,200);
        vehicles [8]= new SportsVehicle("BMW","bens", 2004,5200);
        vehicles [9]= new TruckVehicle("mercedez","dice", 2002,120);
        vehicles [10]= new TruckVehicle("BMW","modelo1", 2011,80);
        vehicles [11]= new TruckVehicle("mercedez","modelo2", 1998,130);

        for (int i=0; i < vehicles.length; i ++){
            System.out.println(vehicles[i].technicalSheet()); */
