/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SPARTAN PC
 */
public class seleccion {

    public void ordenamiento(int a[]) {
        int menor = 0;
        for (int i = 0; i < a.length - 1; i++) {
            menor = i;
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[j] < a[menor]) {
                    menor = j;
                }

            }
            int temporal = a[i];
            a[i] = a[menor];
            a[menor] = temporal;

        }
        System.out.println("ordenando POR SELECCION:  ");
    }

    public void imprime(int a[]) {
        for (int z = 0; z < a.length - 1; z++) {
            System.out.println(a[z] + "\t");
        }
    }
}
