/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.java01;

import javax.swing.JOptionPane;

/**
 *
 * @author osanc
 */
public class EjercicioJAVA01 {

    public static void main(String[] args) {

        int n = 0;
        boolean salir = false;
        boolean reintento = true;
        do {
            String numero_estudiante = JOptionPane.showInputDialog("Ingrese Numero de estudiantes");
            if (numero_estudiante != null) {
                if (esEntero(numero_estudiante)) {
                    n = Integer.parseInt(numero_estudiante);
                    if (n > 0) {
                        reintento = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a 0");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero entero");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Saliendo...");
                salir = true;
            }
        } while (reintento && !salir);

        if (!salir) {
            String[] nombres_estudiantes = new String[n];
            int[] edad_estudiantes = new int[n];
            int edadMayor = 0;
            int edadMenor = 99999;
            int nMultiplos = 0;
            int[] multiplos7 = new int[n];
            reintento = true;
            salir = false;
            int suma_edades = 0;
            int j = 0;
            do {
                do {
                    String nombre_estudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + (j + 1));
                    if (nombre_estudiante != null) {
                        if (!esEntero(nombre_estudiante)) {
                            if (!nombre_estudiante.equals("")) {
                                nombres_estudiantes[j] = nombre_estudiante;
                                reintento = false;
                            } else {
                                JOptionPane.showMessageDialog(null, "Nombre vacio");
                                reintento = true;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        salir = true;
                    }
                } while (reintento && !salir);

                if (!salir) {
                    reintento = true;
                    salir = false;
                    do {
                        String edad_estudiante = JOptionPane.showInputDialog("Ingrese la edad del estudiante " + (j + 1));
                        if (edad_estudiante != null) {
                            if (esEntero(edad_estudiante)) {
                                if (Integer.parseInt(edad_estudiante) > 0) {
                                    edad_estudiantes[j] = Integer.parseInt(edad_estudiante);
                                    suma_edades += edad_estudiantes[j];
                                    if (edad_estudiantes[j] > edadMayor) {
                                        edadMayor = edad_estudiantes[j];
                                    }
                                    if (edad_estudiantes[j] < edadMenor) {
                                        edadMenor = edad_estudiantes[j];
                                    }
                                    if (EsMultiplodeSiete(edad_estudiantes[j])) {
                                        multiplos7[nMultiplos] = edad_estudiantes[j];
                                    }
                                    j++;
                                    reintento = false;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a 0");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Ingrese un numero entero");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Saliendo...");
                            salir = true;
                        }
                    } while (reintento && !salir);
                }
            } while (j < n && !salir);

            if (!salir) {
                String mensaje = "";
                double promedio = (double) suma_edades / n;
                // Impresion de Nombres
                for (int i = 0; i < nombres_estudiantes.length; i++) {
                    mensaje += (i + 1) + " " + nombres_estudiantes[i] + " - " + edad_estudiantes[i] + " aÃ±os\n";
                }
                //  Impresion de edades mayor y menor
                mensaje += " La Edad Mayor es :  " + edadMayor + "\n";
                mensaje += " La Edad Menor es :  " + edadMenor + "\n";
                mensaje += " El Promedio es :  " + promedio + "\n";
                mensaje += " La Suma es :  " + suma_edades + "\n";
                mensaje += "************************\n";

                // Multiplos de 7
                for (int i = 0; i < multiplos7.length; i++) {
                    if (multiplos7[i] > 0) {
                        mensaje += (i + 1) + ". " + multiplos7[i] + "\n";
                    }
                }

                JOptionPane.showMessageDialog(null, mensaje);
            }

        }

    }

    public static boolean EsMultiplodeSiete(int pnNumero) {
        boolean bresultado = false;
        if (pnNumero == 0) {
            bresultado = false;
        }
        if (pnNumero % 7 == 0) {
            bresultado = true;
        } else {
            bresultado = false;
        }
        return bresultado;
    }

    public static boolean esEntero(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
