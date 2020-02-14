/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenacion2020;

import java.util.Arrays;

/**
 *
 * @author Sarita
 */
public class AlgoritmosOrdenacion2020 {

    int[] lista1 = {132, 27, 26, 20, 69, 2, 103};

    public void ordenacionBurbuja(int[] numeros) {
        //EL METODO RECIBE UN ARRAY DE NUMEROS Y LO ORDENARA MEDIANTE EL ALGORITMO DE LA BURBUJA
        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    //SI SE CUMPLE INTERCAMBIO LOS VALORES DE i E i+1
                    int aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmosOrdenacion2020 algoritmo = new AlgoritmosOrdenacion2020();
        //EJERCICIO 1
        System.out.println("Lista sin ordenar:" + Arrays.toString(algoritmo.lista1));
        algoritmo.ordenacionBurbuja(algoritmo.lista1);
        System.out.println(Arrays.toString(algoritmo.lista1));
    }

}
