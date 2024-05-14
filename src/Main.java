public class Main {
    public static void main(String[] args) {
        /*DatosPersonales  obj = new DatosPersonales(nombre:"Gabriela","Palacios Torres");  */


        Coleccion objc = new Coleccion();

        DatosPersonales idp1 = new DatosPersonales("Tomas", "Flores Diaz");


        objc.add(idp1);
        objc.add(new DatosPersonales("Tomas", "Flores Diaz"));
        objc.add(new DatosPersonales("Tomas", "Flores Diaz"));
        objc.add(new DatosPersonales("Tomas", "Flores Diaz"));
        objc.add(new DatosPersonales("Tomas", "Flores Diaz"));

        /*objc.show();*/

        objc.show2();
        objc.buscar("Fernando");

    }
}

