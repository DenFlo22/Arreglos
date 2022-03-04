/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;

/**
 *
 * @author nenni
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Primer Ejemplo*/
        String[] comida = {"Pozole", "Enchiladas", "Hamburgesas", "Ensalada"};
        System.out.println("longitud = " + comida.length);
        System.out.println("Comida 0 = " + comida[0]);
        /* Segundo ejemplo*/
        String[] bebidas = new String[5];
        System.out.println("longitud = " + bebidas.length);
        System.out.println("elemento [0] = " + bebidas[0]);
        System.out.println("elemento [3] = " + bebidas[3]);
        bebidas[0] = "Soda de Limon";
        bebidas[1] = "Coca Cola";
        bebidas[2] = "Agua de Horchata";
        bebidas[3] = "Agua de Jamaica";
        bebidas[4] = "Limonada";
        System.out.println("bebidas [3] = " + bebidas[3]);
        /*Tercer Ejemplo*/
        float[] precios = new float[3];
        System.out.println("longitud = " + precios.length);
        System.out.println("elemento [0] = " + precios[0]);
        System.out.println("elemento [2] =" + precios[2]);
        precios[0] = (float) 25.00;
        precios[1] = (float) 30.00;
        precios[2] = (float) 35.50;
        System.out.println("elemento [2] = " + precios[2]);

        /*Cuarto Ejemplo*/
        float[] precios1 = {(float) 25.00, (float) 30.00, (float) 35.50};
        System.out.println("longitud = " + precios1.length);
        System.out.println("elemento [2] =" + precios1[2]);
        
        ArrayList<chocolate> c1 = new ArrayList <chocolate>();
        
        chocolate chocolate1 = new chocolate (1, "AC");
        c1.add (chocolate1);
        
        chocolate chocolate2 = new chocolate (2, "BA");
         c1.add(chocolate2);
        
        chocolate chocolate3 = new chocolate (3, "PR");
        c1.add (chocolate3);
        
        System.out.println ("longitud de arreglo de objetos: " + c1.size());
        System.out.println("datos del objeto 1 : " + c1.get(2).getEstatus());

    }

}
