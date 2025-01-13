/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Electrodomesticos;

/**
 *
 * @author teres
 */
public class Televisor extends Electrodomestico{
    private double tamanyoPantalla;

    public Televisor() {
    }

    public Televisor(double tamanyoPantalla, String marca) {
        super(marca);
        this.tamanyoPantalla = tamanyoPantalla;
    }

    @Override
    void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.printf(" tamaño de la pantalla %d", this.tamanyoPantalla);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
