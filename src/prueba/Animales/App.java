/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.Animales;

import java.util.Scanner;

/**
 *
 * @author teres
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        Animal n = new Animal();
        Perro p = new Perro();
        Gato g = new Gato();
        
        n.hacerSonido();
        p.hacerSonido();
        g.hacerSonido();
        g.cazarRatones();
        
        Animal[] animales = new Animal[5];
        for(int i = 0; i < animales.length; i++){
            System.out.println("Inserte la especie del animal: ");
            String nombre = t.nextLine();
            
            animales[i]= new Animal(nombre);
        }
    
    for(int i = 0; i < animales.length; i++){
        if(animales[i] instanceof Gato){
            Gato gatos = (Gato)animales[i];
        animales[i] = new Gato();
        gatos.hacerSonido();
    }else{
            Perro perros = (Perro)animales[i];
            animales[i] = perros;
            perros.hacerSonido();
        }
    }
    }
    
   
    
}
