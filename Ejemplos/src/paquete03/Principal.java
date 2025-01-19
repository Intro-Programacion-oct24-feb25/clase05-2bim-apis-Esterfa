/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;

// import paquete04.*;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        // Paso 1: Arreglo inicial de datos como cadenas
        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};

        // Paso 2: Convertir dataInicial a dataFinal con valores enteros
        int[] dataFinal = new int[dataInicial.length];
        for (int i = 0; i < dataInicial.length; i++) {
            // Convertimos las cadenas en enteros usando NumberUtils.toInt
            // Si la conversión falla, devolvemos 0
            dataFinal[i] = NumberUtils.toInt(dataInicial[i], 0);
        }

        // Paso 3: Presentar dataFinal
        System.out.print("dataFinal = {");
        for (int i = 0; i < dataFinal.length; i++) {
            System.out.print(dataFinal[i]);
            if (i < dataFinal.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Paso 4: Usar las clases OperadorUno, OperadorDos y OperadorTres
        int valorA = OperadorUno.obtenerNumero(dataFinal[0]); // Tomar el primer valor
        int valorB = OperadorUno.obtenerNumero(dataFinal[1]); // Tomar el segundo valor
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        int multiplicacion = OperadorTres.obtenerMultiplicacion(valorA, valorB);

        // Mostrar resultados
        System.out.printf(
            "La suma de %d + %d es igual a: %d\n"
            + "La multiplicacion de %d * %d es igual a: %d\n",
            valorA, valorB, suma, valorA, valorB, multiplicacion
        );
    }
}
