public class Main {


    public static void main(String[] args) {
        System.out.println(sumar(10,20,30));

        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();
        miCoche.incrementarPuerta();
        System.out.println(miCoche.nroPuertas);
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    int nroPuertas = 4;

    public void incrementarPuerta(){
        this.nroPuertas++;
    }
}
