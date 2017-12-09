/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jhon Nash
 */
public class Algoritmo_genetico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vuelta = 0;
        
        //Poblacion inicial generada al azar
        Poblacion poblacion = new Poblacion(Ejemplo.getInstance().tamanioPobInicial);
        poblacion.generar();
        poblacion.setNumero(vuelta);
        
        //Criterio de paro por cantidad de vueltas
        while(vuelta < Ejemplo.getInstance().cantVueltas){
            vuelta++;

            poblacion = Algoritmos.evolucionarPoblacion(poblacion);
            poblacion.setNumero(vuelta);
            System.out.println(poblacion.toString());


        }
    }
        
        
}
