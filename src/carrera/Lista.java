/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Abel
 */
public class Lista {
    private List <Corredores> corredores2;

    public Lista() {
        corredores2=new ArrayList <>();
    }

    public List<Corredores> getCorredores2() {
        return corredores2;
    }

    public void setCorredores2(List<Corredores> corredores2) {
        this.corredores2 = corredores2;
    }

    public Lista(List <Corredores> corredores) {
        this.corredores2 = corredores;
    }
    
    public void rellenarLista(){//comprobar que no se introduzcan mismos corredores, mientras se esta rellenando la lista
        Corredores c1=new Corredores();
        c1.rellenarCorredor(corredores2);
        if(corredores2.isEmpty()){
           corredores2.add(c1);
        }else{
            boolean repetido=false;
            do{
                for (int i = 0; i <corredores2.size(); i++) {
                    if(corredores2.get(i).getDni()==c1.getDni()){
                        System.out.println("Corredor ya esta inscrito. Introduce otro corredor\n");
                        c1.rellenarCorredor(corredores2);
                        repetido=true;
                    }else{
                        repetido=false;
                    }
                }
            }while(repetido);
            corredores2.add(c1);
        }
    }
    
    public void sortearGanadores(){
        
        while(corredores2.size()<3){
            System.out.println("No hay suficientes corredores para asignar los tres primeros premios. Introduce más corredores");
            Corredores c1=new Corredores();
            c1.rellenarCorredor(corredores2);
            boolean repetido=false;
            do{
                for (int i = 0; i <corredores2.size(); i++) {
                    if(corredores2.get(i).getDni()==c1.getDni()){
                        System.out.println("Corredor ya esta inscrito. Introduce otro corredor\n");
                        c1.rellenarCorredor(corredores2);
                        repetido=true;
                    }else{
                        repetido=false;
                    }
                }
            }while(repetido);
            corredores2.add(c1);
        }
        
         
        int ganador1,ganador2,ganador3;
        Random rand=new Random();
        ganador1=rand.nextInt(corredores2.size());
        ganador2=rand.nextInt(corredores2.size());
        
        while(ganador2==ganador1){
            ganador2=rand.nextInt(corredores2.size());
        }
        
        ganador3=rand.nextInt(corredores2.size());
        
        while(ganador3==ganador1||ganador3==ganador2){
             ganador3=rand.nextInt(corredores2.size());
        }
        
        System.out.println("\nLos dorsales ganadores son los siguientes de forma respectiva: "+(ganador1+1)+" "+(ganador2+1)+" "+(ganador3+1));
        System.out.printf("%n%-10s%-15s%-20s%-10s%n","Dorsal","Nombres","Apellido","DNI");
        System.out.printf("%-10d%-15s%-20s%-10d%n",corredores2.get(ganador1).getDorsal(),corredores2.get(ganador1).getNombre(),corredores2.get(ganador1).getApellidos(),corredores2.get(ganador1).getDni());
        System.out.printf("%-10d%-15s%-20s%-10d%n",corredores2.get(ganador2).getDorsal(),corredores2.get(ganador2).getNombre(),corredores2.get(ganador2).getApellidos(),corredores2.get(ganador2).getDni());
        System.out.printf("%-10d%-15s%-20s%-10d%n",corredores2.get(ganador3).getDorsal(),corredores2.get(ganador3).getNombre(),corredores2.get(ganador3).getApellidos(),corredores2.get(ganador3).getDni());
       
    }
    
    
    public void mostrarCorredores(List <Corredores> listper){
        if(!listper.isEmpty()){
           System.out.printf("%n%-10s%-20s%-11s%-5s%n","Nombre","Apellidos","DNI","Dorsal");
                for(Corredores c:listper){
                System.out.printf("%-10s%-20s%-11d%-5d%n",c.getNombre(),c.getApellidos(),c.getDni(),c.getDorsal());
                } 
        }else{
            System.out.println("Aún no hay participantes");
        }
        
    }
}
