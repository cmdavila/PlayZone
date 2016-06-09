/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueticos;

/**
 *
 * @author Carlitox
 */
public class Nodo {
    //Atributos de nodo con doble referencia
    //Agregar distancia entre los juegos no se si aun es en esta clase o en juego o en lista
    private Nodo Siguiente;
    private Juego Dato;
    private Nodo Anterior;
    private Lista Adyacentes; //Lista de juegos cercanos o a los que se puede ir
    
    //Metodo constructor
    public Nodo(Juego Dato) {
        this.Dato = Dato;//
        Siguiente=Anterior=null;//Se colocan las referencias como vacias
        Adyacentes=new Lista();//Se inicializa la lista de juegos cercanos
    }

    /**
     * @return the Siguiente
     */
    public Nodo getSiguiente() {
        return Siguiente;
    }

    /**
     * @param Siguiente the Siguiente to set
     */
    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    /**
     * @return the Dato
     */
    public Juego getDato() {
        return Dato;
    }

    /**
     * @return the Anterior
     */
    public Nodo getAnterior() {
        return Anterior;
    }

    /**
     * @param Anterior the Anterior to set
     */
    public void setAnterior(Nodo Anterior) {
        this.Anterior = Anterior;
    }

    /**
     * @return the Adyacentes
     */
    public Lista getAdyacentes() {
        return Adyacentes;
    }
    
    
    
    
    
    
    
}
