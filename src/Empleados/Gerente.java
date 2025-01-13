/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author teres
 */
public class Gerente extends Empleado {
    private double bono;

    public Gerente() {
    }

    public Gerente(double bono) {
        this.bono = bono;
    }

    public Gerente(double bono, double sal) {
        super(sal);
        this.bono = bono;
    }
    
    void calcularSalarioTotal(){
        
        System.out.println(this.sal + this.bono);
        
    }
}
