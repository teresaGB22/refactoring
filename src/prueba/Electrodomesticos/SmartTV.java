/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.Electrodomesticos;

/**
 *
 * @author teres
 */
public class SmartTV extends Televisor{
    private String conexioInternet;

    public SmartTV(String conexioInternet) {
        this.conexioInternet = conexioInternet;
    }

    public SmartTV(String conexioInternet, double tamanyoPantalla, String marca) {
        super(tamanyoPantalla, marca);
        this.conexioInternet = conexioInternet;
    }

    @Override
    void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.printf(" Conexión a internet: %s", this.conexioInternet);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
