package metodoinsercion;

public class AlgoritmoDeOrdenamiento2 {

    int i, j, temporal, pasadas;

    public AlgoritmoDeOrdenamiento2() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    public void inserccion(int[] arreglo, int n) {
        int i, j, auxiliar;
        for (i = 1; i < n; i++) {
            auxiliar = arreglo[i];
            j = i - 1;
            while (j >= 0 && arreglo[j] > auxiliar) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = auxiliar;

        }

        mostrarArreglo(arreglo);
    }

    public void mostrarArreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]");

        }
        System.out.println();
    }
}
