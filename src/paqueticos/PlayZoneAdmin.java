
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
        System.out.println("3. Eliminar un juego por el nombre");
        System.out.println("4. Salir");
        int dato=ingreso.nextInt();
        return dato;       
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista coleccion = new Lista();
        int opcion;
        do{
        opcion=menu();
                switch(opcion)
                {
                    case 1: 
                        Juego j1 =new Juego();
                        j1.setNombre(leerString("Inserte el nombre"));
                        j1.setPrecio(leerInt("Ingrese el precio"));
                        j1.setIndiceDiversion(leerInt("Ingrese el indice de diversion"));
                        coleccion.AgregarJuego(j1);
                    break;
                        
                    case 2: 
                        coleccion.ImprimirLista();
                    break;
                        
                    
                    default:
                        
                }
        }while(opcion<3);

    }
    
}