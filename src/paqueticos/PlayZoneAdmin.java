
package paqueticos;

import java.util.Scanner;

public class PlayZoneAdmin {
    
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
        System.out.println("\t Modo Administrador");
        System.out.println("\n");
        System.out.println("\t Menu");
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Agregar un juego");
        System.out.println("2. Imprimir Juegos.");
        System.out.println("5. Eliminar un juego por el nombre");
        System.out.println("12. Salir");
        int dato=ingreso.nextInt();
        return dato;       
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        
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
    
}