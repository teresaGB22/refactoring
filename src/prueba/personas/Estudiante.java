/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.personas;

/**
 *
 * @author teres
 */
public class Estudiante extends Persona{
    private String carrera;

    public Estudiante() {
    
    }

    public Estudiante(String carrera, int edad, String nombre) {
        super(edad, nombre);
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        super.presentarse(); 
    }
    public void estudy(){
        System.out.println("Estoy estudiando " + this.carrera);
    }
}
