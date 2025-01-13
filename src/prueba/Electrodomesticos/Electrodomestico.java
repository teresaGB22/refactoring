/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Electrodomesticos;

/**
 *
 * @author teres
 */
public class Electrodomestico {
    private String marca;

    public Electrodomestico() {
    }

    public Electrodomestico(String marca) {
        this.marca = marca;
    }
    void mostrarDetalles(){
        System.out.printf("marca: %s", this.marca);
    }
}
