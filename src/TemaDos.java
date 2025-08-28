
import java.util.ArrayList;
public class TemaDos {
    public static void main(String[] args) {
        ArrayList<Integer> sumaNumeros = new ArrayList<>();

        sumaNumeros.add(10);
        sumaNumeros.add(3);
        sumaNumeros.add(3);
        sumaNumeros.add(55);

        //sumar
        int s = 0;
        for (int x : sumaNumeros) {
            s += x;
        }
        System.out.println("La suma es: " + s);
        //Contar Pares
        int c = 0;
        for (int x : sumaNumeros) {
            if (x % 2 == 0) c++;
        }
        System.out.println("Cantidad de numeros pares: " + c);
        //Buscar
        boolean estado = false;
        for (int x : sumaNumeros) {
            if (x == 3) estado = true;
        }
        System.out.println("El numero 3 existe? " + estado);
    }
}
