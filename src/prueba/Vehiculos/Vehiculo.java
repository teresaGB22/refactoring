/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Vehiculos;

/**
 *
 * @author teres
 */
public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    void mostrarDetalles(){
        System.out.println("marca: " + this.marca + " \n" + "modelo: " + this.modelo);
    }
}
