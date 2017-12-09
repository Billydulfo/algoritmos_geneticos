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
public class Individuo {
    private int cantGenes = Ejemplo.getInstance().items.length;;
    private int[] genes;
    
    private int peso;
    private int aptitud;

    public Individuo() {
        this.genes = new int [cantGenes];
        this.peso = -1;
        this.aptitud = -1;
    }
    
    //Setea aleatoriamente en 1 o 0 el valor de cada gen (presencia del item n)
    public void generar() {
        for(int n = 0; n < cantGenes; n++){   //la cantidad de genes se refiere 
            setGen(n, (int) Math.round(Math.random()));//a los conjuntos de 
        }                                               //alelos
    }
    
    public int getCantGenes(){
        return cantGenes;
    }

    public int getGen(int numero){
        return genes[numero];
    }

    public void setGen(int numero, int valor){
        genes[numero] = valor;
    }
    
    public int getAptitud(){
        if(aptitud == -1){
            aptitud = FuncionAptitud.getAptitud(this);
        }
        return aptitud;
    }
    
    //Ejemplo: "1100101011"
    public String getCromosoma(){
        String cromosoma = "";

        for(int n = 0; n < cantGenes; n++){
            cromosoma = cromosoma + String.valueOf(getGen(n));
        }

        return cromosoma;
    }
    
    public int getPeso(){
       if(peso == -1){
           for(int n = 0; n < cantGenes; n++){
               //peso del item n * 1 o 0 segun el gen
               peso = peso + Ejemplo.getInstance().getItem(n).peso * getGen(n);
           }
       }

        return peso;
    }
    
    public String toString(){
        String string = "Cromosoma = " + getCromosoma() + " Aptitud = " +
                String.valueOf(getAptitud()) + " Peso = " + getPeso();

        return string;
    }

}
