/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueticos;

import java.util.Scanner;

/**
 *
 * @author Carlitox
 */
public class PlayZoneAdmin {

    /**
     * @param args the command line arguments
     */
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
