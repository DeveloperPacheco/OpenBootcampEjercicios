public class Main {

    public static void main(String[] args) {

        //Impresion primera parte

        System.out.println(suma(10,20,30));

        System.out.println("------------------------------------");

        //Impresion segunda parte

        Coche miCoche = new Coche(1);
        miCoche.agregarPuerta();

        System.out.println("El coche tiene " + miCoche.obtenerPuertas() + " puertas");
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

    public static class Coche{
        int numPuertas;

        public Coche(int numPuertas) {
            this.numPuertas = numPuertas;
        }

        public void agregarPuerta(){
            this.numPuertas += 1;
        }

        public int obtenerPuertas(){
            return this.numPuertas;
        }


    }
}