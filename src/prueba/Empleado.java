/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author teres
 */
public class Empleado extends Persona{

   double salario;
   String estatura;
  
  @Override
  void mostrarDatos(){
      super.mostrarDatos();
      System.out.println(salario);
  }
    
}
