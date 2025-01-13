/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Vehiculos;

/**
 *
 * @author teres
 */
public class Coche extends Vehiculo {
    private int puertas;

    public Coche( String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }
    
    @Override
    void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("puertas: " + this.puertas + " \n");
    }
}
