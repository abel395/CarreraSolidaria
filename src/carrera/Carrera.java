/*
Es una carrera la cual va a ir pidiendo corredores, cuando se acabe de introducir corredores, se hara un sorteo automático de dorsales
Después de asignar los dorsales, al acabar la carrera se dirá de forma aleatoria 3 ganadores mediante su dorsal.
Y en la pantalla saldrá el nombre, apellidos y dni de los ganadores
 */
package carrera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Abel
 */
public class Carrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l1=new Lista ();
        Scanner sc=new Scanner (System.in);
        int respuesta2;
        List <Corredores> listanueva=new ArrayList <>();
        do{
            System.out.printf("Menú:%n1- Introducir participantes%n2- Visualizar lista de participantes%n3- Visualizar los 3 ganadores%n4- Salir del menú%n");
            respuesta2=sc.nextInt();
            switch(respuesta2){
                case 1:
                    l1.rellenarLista();
                    break;
                case 2:
                    listanueva.addAll(l1.getCorredores2());
                    l1.mostrarCorredores(listanueva);
                    break;
                case 3:
                    l1.sortearGanadores();
                    break;
                case 4:
                    break;
            }
        }while(respuesta2<4);
        System.out.println("Final del menú");
        System.out.println("Esto es una prueba de como funciona el push de Netbeans hacia el Github");
    }
    
}
