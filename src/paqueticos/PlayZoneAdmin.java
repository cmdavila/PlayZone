
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
    public static int menuAdmin()
    {
        //Menu de administrador para agregar juegos.
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
     
       public static int menucliente()
    {
 
        //Menu de administrador para agregar juegos.
        Scanner ingreso=new Scanner(System.in);
        System.out.println("\t Modo Cliente");
        System.out.println("\n");
        System.out.println("\t Menu");
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Buscar 3 juegos por diversión ");
        System.out.println("2. Optimizar juegos por precio ");
        System.out.println("3. Salir");
        int dato=ingreso.nextInt();
        return dato;         
    }
  public static int menu()
    {
 
        //Menu de administrador para agregar juegos.
        Scanner ingreso=new Scanner(System.in);
        System.out.println("\t Menu");
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Administrador ");
        System.out.println("2. Cliente ");
        System.out.println("3. Salir");
        int dato=ingreso.nextInt();
        return dato;         
    }    
       
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista coleccion = new Lista();
        Lista diversion =new Lista();
        int opcion;
        int opcion2;
        int opcion3;
        do{
        opcion=menu();
                if(opcion==1)
                {
                    do{
                        opcion2=menuAdmin();
                            switch(opcion2)
                            {
                                case 1: 
                                       Juego j1 =new Juego();
                                    j1.setNombre(leerString("Inserte el nombre"));
                                    j1.setPrecio(leerInt("Ingrese el precio"));
                                    j1.setIndiceDiversion(leerInt("Ingrese el indice de diversion"));
                                    coleccion.agregarMedio(j1, coleccion.BuscarNombre(leerString("Ingrese el juego siguiente ")));
                                    diversion.Ordenar(j1);
                                break;

                                    case 2: 
                                        coleccion.ImprimirLista();
                                        System.out.println("asdfgsadfdgfh");
                                        diversion.ImprimirLista();
                                    break;

                                    case 3:
                                        coleccion.eliminarNodo(leerString("Ingrese el nombre a eliminar "));
                                        break;

                                case 4:
                            }
                    }while(opcion2<4);
                }
                else if (opcion==2){        
                        do{
                        opcion3=menucliente();
                                switch(opcion3)
                                {
                                    case 1: 
                                        diversion.buscarDiversion(leerInt("Ingresar diversion deseada"));
                                    break;

                                    case 2: 
                                        coleccion.ImprimirLista();
                                    break;


                                    default:

                                }
                        }while(opcion3<3);
            
                }  
                
            }while(opcion<3);

        }
    }
    
