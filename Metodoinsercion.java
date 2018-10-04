package metodoinsercion;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodoinsercion {

    public static void main(String[] args) {
         Random miAleatorio = new Random();
        AlgoritmoDeOrdenamiento2 ordenar = new AlgoritmoDeOrdenamiento2();
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos de su Arreglo");
        int tam = valor.nextInt();
        int num;
        int vector[] = new int[tam];

        for (int i = 0; i < vector.length; i++) {
            num = (int) (miAleatorio.nextDouble() * 1000000);
            vector[i] = num;
        }
        System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector);
        System.out.println("Arreglo Ordenado con inserccion");
        ordenar.inserccion(vector,tam);
    }
}
