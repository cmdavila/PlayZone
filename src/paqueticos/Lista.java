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
//    public void AgregarJuego(Juego nuevo){
//        //Se crea un auxiliar para agregar un elemento al final
//        Nodo aux=new Nodo(nuevo, null, null);
//        
//        //Si la lista esta vacia
//        if (Primero==Ultimo&&Primero==null){
//            Primero=aux;
//            Ultimo=aux;
//            Primero.setSiguiente(Ultimo);
//            Ultimo.setAnterior(Primero);
//            Primero.setAnterior(null);
//        }
//        
//        //Si la lista tiene un unico elemento
//        else if (Primero.getDato()==Ultimo.getDato()&&Ultimo!=null){
//            Ultimo.setSiguiente(aux);
//            aux.setAnterior(Ultimo);
//            Ultimo=aux;            
//        }        
//        //Si la lista tiene dos o mas elementos
//        else {
//            aux.setAnterior(Ultimo);
//            Ultimo.setSiguiente(aux);
//            Ultimo=aux;
//        }
//    }
    
    //Metodo para agregar un juego en cualuier parte de la lista
    //se utiliza para agregar el juego antes del juego mencionado.
    public void agregarMedio(Juego datos, Nodo nodoAnterior){
        Nodo aux1=Primero;
        Nodo aux2=Primero;
        
        while(aux1!=nodoAnterior){
            aux2=aux1;
            aux1=aux1.getSiguiente();
        }
        Nodo nuevo=new Nodo(aux1, datos);
        if(aux1==Primero){
                if(Primero==Ultimo && Primero==null){
                    Primero=Ultimo=nuevo;
                }else{
                    Primero.setAnterior(nuevo);
                    Primero=nuevo;
                 }
        }else
            aux2.setSiguiente(nuevo);   
    }
    
   
    //con este método comparamos el nombre agregado con el nombre de cada juego de la lista
    //retornamos un nodo para utilizar en el método anterior.
 public Nodo BuscarNombre(String dato){
     //Creamos auxiliar apuntando al primer nodo de la lista
        Nodo aux=Primero;
        // inicializamos una variable tipo nodo para retornar
        Nodo retorno = null;
        while(aux!=null){           
            if(aux.getDato().getNombre().equals(dato)){//comparamos el nombre obtenido con el nombre del nodo
                retorno = aux;
                aux=aux.getSiguiente();
            }else{
                aux=aux.getSiguiente();
            }
        }
        return retorno;
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
        }
        
        Nodo aux=Primero;//Inicializar el contador
        
        //Imprimir los elementos de la lista con un indice para posteriormente escogerlo
        for(int i=0; i<ObtenerTamanio(); i++){
            System.out.println((i+1) + ". " + aux.getDato().getNombre());
            System.out.println("Precio " + aux.getDato().getPrecio());
            System.out.println("Diversion : " + aux.getDato().getIndiceDiversion());
            aux=aux.getSiguiente();            
        }        
        
    }
    
    public boolean eliminarNodo(String nombre) {
 
        if (Primero != null) {
            //Cuando solo existe un elemento
            if (Primero == Ultimo && Primero.getDato().getNombre().equals(nombre)) {
                Primero = Ultimo = null;
                return true;
            //Cuando el elemento a eliminar esta en el inicio
            } else if (Primero.getDato().getNombre().equals(nombre)) { 
                Primero=Primero.getSiguiente(); 
             
            //Cuando no esta ni en el inicio ni en el fin el elemento a eliminar
            } else {
                
                Nodo anterior = Primero; 
                Nodo temporal = Primero.getSiguiente(); 
               
                //Para recorrer la lista y encontrar el elemento para eliminar
                while (temporal != null && temporal.getDato().getNombre().contains(nombre)==false) {
                    anterior=anterior.getSiguiente(); 
                    temporal=temporal.getSiguiente();
                }
                
                    //Aqui se elimina el elemento encontrado
                    if (temporal != null && temporal.getDato().getNombre().contains(nombre)==true) {
                        anterior.setSiguiente(temporal.getSiguiente());
                        //Si el elemento esta en el final
                        if (temporal == Ultimo ) { 
                            Ultimo = anterior;        
                        }
                    return true;
                    }
 
                return false;
            }
 
        }return false;
 
    }
    
    public void buscarDiversion(int dato){
     //Creamos auxiliar apuntando al primer nodo de la lista
        Nodo aux=Primero;
        Lista lista=new Lista();
        while(aux!=null){           
            if(aux.getDato().getIndiceDiversion()==dato){//comparamos la diverci[on necesaria obtenido con la diverci[on de los nodos
                System.out.println(" Juego  " + aux.getAnterior().getDato().getNombre() + 
                        " \n Diversion " + aux.getAnterior().getDato().getIndiceDiversion());
                System.out.println(" Juego  " + aux.getDato().getNombre() + 
                        " \n Diversion " + aux.getDato().getIndiceDiversion());
                System.out.println(" Juego  " + aux.getSiguiente().getDato().getNombre() + 
                        " \n Diversion " + aux.getSiguiente().getDato().getIndiceDiversion());
                aux=aux.getSiguiente();
            }else{
                aux=aux.getSiguiente();
            }
        }
    }
    
public void Ordenar(Juego datos){
        Nodo aux=Primero;
        Nodo nuevo=new Nodo(datos);
        if(Primero==Ultimo && Primero==null){
             Primero=nuevo=Ultimo;
        }
        else{
            if(Primero.getDato().getIndiceDiversion()>nuevo.getDato().getIndiceDiversion()){
                nuevo.setSiguiente(Primero);
                Primero=nuevo;
            }
            else{
                while(aux.getSiguiente()!=null && aux.getSiguiente().getDato().getIndiceDiversion()<=nuevo.getDato().getIndiceDiversion()){
                    aux=aux.getSiguiente();
                }
                nuevo.setSiguiente(aux.getSiguiente());
                nuevo.setAnterior(aux);
                aux.setSiguiente(nuevo);
                aux=nuevo.getSiguiente();
                aux.setAnterior(nuevo);
            }
        }
    }
}
