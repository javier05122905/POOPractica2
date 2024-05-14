import java.util.List;
import java.util.ArrayList;

public class Coleccion {
    List<DatosPersonales> listaDatos = new ArrayList<>();

    public void add(DatosPersonales datos){
        listaDatos.add(datos);
    }

    public void show(){
        for (DatosPersonales dato : listaDatos){
            System.out.println(dato);
        }
    }

    public void show2(){
        /*El uso de esto se le denomina funciones lambda o funciones flecha*/
        listaDatos.forEach(dato -> System.out.println(dato));
    }

    public void buscar(String nombre){
        listaDatos.forEach(dato -> {
            if(dato.getNombre().equals(nombre)){
                System.out.println(dato);
            }


        });
    }
}
