/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Abel
 */
public class Corredores {
    private int dorsal, dni;
    private String nombre, apellidos;

    public Corredores(int dorsal, int dni, String nombre, String apellidos) {
        this.dorsal = dorsal;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Corredores() {
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void rellenarCorredor(List <Corredores> c1){
        Scanner sc=new Scanner (System.in);
        System.out.println("Nombre:");
        nombre=sc.nextLine();
        System.out.println("Apellidos:");
        apellidos=sc.nextLine();
        System.out.println("DNI (sólo dígitos)");
        dni=sc.nextInt();
        dorsal=c1.size()+1;//paso como parametro la lista asi tengo el tamaño y puedo hacer dorsales con ello
//        c1.add(this); //esto hace rellenar la lista con este mismo método
        
    }
}
