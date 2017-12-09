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
public class Ejemplo {
    public int tamanioPobInicial = 20;      /*Poblacion generada al azar*/

    public Item[] items = new Item[10];     /*Elementos que se introduciran en la mochila*/ 
    public int pesoMax = 130;
    public int factorExcesoPeso = 5; /*insertamos esta k cuando se pasa de peso o no es optima la solucion*/ 

    public double probCruce = 0.5;
    public double probMutacion = 0.5;
    public int tamanioPobTorneo = 5;

    public int cantVueltas = 15;

    private static Ejemplo INSTANCE = null;

    private Ejemplo(){
        crearItems();
    }

    public static Ejemplo getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Ejemplo();
        }
        return INSTANCE;
    }

    private void crearItems(){
        items[0] = new Item(18, 60);
        items[1] = new Item(15, 55);
        items[2] = new Item(54, 100);
        items[3] = new Item(33, 77);
        items[4] = new Item(18, 60);
        items[5] = new Item(20, 65);
        items[6] = new Item(42, 85);
        items[7] = new Item(7, 45);
        items[8] = new Item(28, 72);
        items[9] = new Item(33, 77);
    }

    public Item getItem(int numero){
        return items[numero];
    }
    
    
}
