/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueticos;

import java.util.Scanner;

/**
 *
 * @author 
 */


public class PlayZoneAdmin {

     /**
     * @param args the command line arguments
     */
    public static String leerString(String mensaje)
    {
       Scanner ingreso=new Scanner(System.in);
        System.out.println(mensaje);
        String dato=ingreso.nextLine();
        return dato;
    }
    public static int leerInt(String  mensaje){
        Scanner n= new Scanner(System.in);
        System.out.println(mensaje);
        int dato=n.nextInt();
        return dato;
    } 
    public static double leerDouble(String  mensaje){
        Scanner n= new Scanner(System.in);
        System.out.println(mensaje);
        double dato=n.nextInt();
        return dato;
    }
    public static int menu()
    {
        Scanner ingreso=new Scanner(System.in);
        System.out.println("\t Bienvenidos a la Tienda de VideoJuegos");
        System.out.println("\n");
        System.out.println("\t Menu");
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Agregar un juego al inicio.");
        System.out.println("2. Agregar un juego al medio.");
        System.out.println("3. Agregar un juego al final.");
        System.out.println("4. Imprimir.");
        System.out.println("5. Eliminar un juego por el nombre");
        System.out.println("6. Buscar un juego por Nombre.");
        System.out.println("7. Buscar un juego por Plataforma.");
        System.out.println("8. Buscar un juego por Precio.");
        System.out.println("9. Buscar un juego por Numero de Jugadores.");
        System.out.println("10. ");
        System.out.println("11. ");
        System.out.println("12. Salir");
        int dato=ingreso.nextInt();
        return dato;       
    }
    public static void main(String[] args) {
        // TODO code application logic here
<<<<<<< HEAD
        Scanner leer=new Scanner(System.in);
        Lista Prueba=new Lista();
        Juego uno=new Juego("Uno", 0.5, 3);
        Juego dos=new Juego("Dos", 1.5, 2);
        Juego tres=new Juego("Tres", 2.5, 1);
        
        Prueba.AgregarJuego(uno);
        Prueba.ObtenerJuego(0).getAdyacentes().AgregarJuego(dos);
        Prueba.ObtenerJuego(0).getAdyacentes().AgregarJuego(tres);
        System.out.println("Usted esta en el juego " + Prueba.ObtenerJuego(0).getDato().getNombre());
        Prueba.ObtenerJuego(0).getAdyacentes().ImprimirLista();
        System.out.println("A donde desea ir? ");
        int sig=leer.nextInt();
        Nodo nuevo=Prueba.ObtenerJuego(0).getAdyacentes().ObtenerJuego(sig-1);
        System.out.println(nuevo.getDato().getNombre());
        Prueba.AgregarJuego(dos);
        Prueba.AgregarJuego(tres);
        
        
        
        System.out.println(Prueba.ObtenerTamanio());
        
        System.out.println(Prueba.ObtenerJuego(2-1).getDato().getNombre());
    }
    
=======
        
        Lista coleccion = new Lista();
        int opcion;
        do{
        opcion=menu();
                switch(opcion)
                {
                    case 1: 
                        Juego j1 =new Juego(leerString("Ingrese el nombre: "),leerString("Ingrese la plataforma: "),leerDouble("Ingrese el precio: "),leerInt("Ingrese el numero de jugadores que puede tener el juego; "));
                        coleccion.agregarInicio(j1);
                    break;
                        
                    case 2: 
                        Juego j2 =new Juego(leerString("Ingrese el nombre: "),leerString("Ingrese la plataforma: "),leerInt("Ingrese el precio: "), leerInt("Ingrese el numero de jugadores que puede tener el juego; "));
                        int precio=leerInt("ingrese el precio que quiere que este despues: ");
                        coleccion.agregarMedio(j2, coleccion.Buscar(precio));
                    break;
                        
                    case 3: 
                        Juego j3 =new Juego(leerString("Ingrese el nombre: "),leerString("Ingrese la plataforma: "),leerInt("Ingrese el precio: "), leerInt("Ingrese el numero de jugadores que puede tener el juego; "));
                        coleccion.agregarFinal(j3);
                    break;
                        
                    case 4: 
                        coleccion.imprimir(); 
                    break;   
                        
                    case 5:
                        coleccion.eliminarNodo(leerString("ingrese el nombre del juego a eliminar: "));
                    break;
                        
                    case 6:      
                        
                        String nombre=leerString("Ingrese el nombre del juego a buscar");
                        System.out.println("\t"+nombre);
                        coleccion.BuscarNombre(nombre);                     
                        
                    break;
                        
                    case 7: 
                                       
                        String plataforma=leerString("Ingrese la plataforma del juego a buscar");
                        System.out.println("\t"+plataforma);
                        coleccion.BuscarPlataforma(plataforma);
                        
                    break;
                    
                    case 8:                 
                        double precio1=leerDouble("Ingrese el precio del juego a buscar");
                        System.out.println("\t"+precio1);
                        coleccion.BuscarPrecio(precio1);
                        
                        
                    break;
                        
                     case 9:               
                        int numerodeJugadores=leerInt("Ingrese el numero de jugadores del juego a buscar");
                        System.out.println("\t"+numerodeJugadores);
                        coleccion.BuscarNumerodeJugadores(numerodeJugadores);
                                               
                    break;
                   
                    //case 7: coleccion.imprimirLista(leerString("Ingrese la marca: "), leerDouble("Ingrese el precio"));
                     case 12:System.out.println("Adios");
                    break;
                    
                    default:
                        System.out.println(" No existe esa opcion. Ingrese otra opcion.");
                        
                }
        }while(opcion<12);
    }    
>>>>>>> origin/master
}
