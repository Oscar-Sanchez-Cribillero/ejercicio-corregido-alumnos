package metodoburbuja;

import java.util.Random;
import java.util.Scanner;

public class Metodoburbuja {

    public static void main(String[] args) {

        Random miAleatorio = new Random();
        AlgoritmodeOrdenamiento4 ordenar = new AlgoritmodeOrdenamiento4();
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos de su Arreglo");
        int tam = valor.nextInt();
        int num;
        int vector2[] = new int[tam];

        for (int i = 0; i < vector2.length; i++) {
            num= (int)(miAleatorio.nextDouble()*1000000);
           vector2[i]=num;
        }

        System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector2);
        System.out.println("Arreglo Ordenado con Burbuja");
        ordenar.burbuja(vector2);
        ordenar.mostrarArreglo(vector2);

    }

}
