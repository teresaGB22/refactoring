/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author teres
 */
public class Persona {

    protected String nombre;
    protected double estatura;
    protected int edad;

    public Persona() {
    }

    void mostrarDatos(){
        System.out.println(this.nombre);
        System.out.println(this.edad);
        System.out.println(this.estatura);
    }
}
