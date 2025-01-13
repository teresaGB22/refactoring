/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author teres
 */
public class Cliente extends Persona{
    int id;

    @Override
    void mostrarDatos() {
        super.mostrarDatos(); 
        System.out.println(this.id);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
