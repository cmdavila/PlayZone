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
public class Lista {
    //Atributos
    private Nodo Primero;
    private Nodo Ultimo;
    
    //Metodo Constructor
    public Lista(){
        Primero=Ultimo=null;
    }
    
    //Agregar nodo a la lista
    public void AgregarJuego(Juego nuevo){
        //Se crea un auxiliar para agregar un elemento al final
        Nodo aux=new Nodo(nuevo, null, null);
        
        //Si la lista esta vacia
        if (Primero==Ultimo&&Primero==null){
            Primero=aux;
            Ultimo=aux;
            Primero.setSiguiente(Ultimo);
            Ultimo.setAnterior(Primero);
            Primero.setAnterior(null);
        }
        
        //Si la lista tiene un unico elemento
        else if (Primero.getDato()==Ultimo.getDato()&&Ultimo!=null){
            Ultimo.setSiguiente(aux);
            aux.setAnterior(Ultimo);
            Ultimo=aux;            
        }        
        //Si la lista tiene dos o mas elementos
        else {
            aux.setAnterior(Ultimo);
            Ultimo.setSiguiente(aux);
            Ultimo=aux;
        }
    }
    
    //Metodo para obtener el tamanio de la lista
    public int ObtenerTamanio(){
        int cont=0;
        Nodo aux=Primero;
        
        //Ciclo para contar los elementos de la lista
        do {
            cont++;
            aux=aux.getSiguiente();
        }while(aux!=null);
        
        return cont;
    }
    
    //Metodo para obtener el juego de un lugar especifico de la lista
    public Nodo ObtenerJuego(int posicion){
        Nodo aux=Primero;
        
        //Si el numero solicitado es mayor al tamanio de la lista
        if (posicion>ObtenerTamanio()){
            System.out.println("Numero incorrecto");
            return null;
        }
        
        //Ciclo for para obtener el juego deseado
        for (int i=0; i<posicion; i++){
            aux=aux.getSiguiente();
        }
        
        return aux;        
    }
    
    //Imprimir lista
    public void ImprimirLista(){
        //La lista esta vacia
        if (Primero==Ultimo&&Primero==null){
            System.out.println("La lista esta vacia");
            return;
        }
        
        Nodo aux=Primero;//Inicializar el contador
        
        //Imprimir los elementos de la lista con un indice para posteriormente escogerlo
        for(int i=0; i<ObtenerTamanio(); i++){
            System.out.println((i+1) + ". " + aux.getDato().getNombre());
            aux=aux.getSiguiente();            
        }        
        
    }
    
}
