/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SPARTAN PC
 */
public class Principal_Ordenamiento {

    public static void main(String[] args) {
        seleccion sele = new seleccion();
        int[] arreglo = {12, 67, 37, 83, 12, 1, 67, 8, 5, 71};

        sele.ordenamiento(arreglo);
        sele.imprime(arreglo);

    }
}
