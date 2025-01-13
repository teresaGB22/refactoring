
package Empleados;

public class Gerente extends Empleado {
    private double bono;

    // Constructor por defecto
    public Gerente() {
        super(); // Llamada explícita al constructor de la clase base
    }

    // Constructor con bono
    public Gerente(double bono) {
        super();
        this.bono = bono;
    }

    // Constructor con salario y bono
    public Gerente(double bono, double salario) {
        super(salario); // Llama al constructor de la clase base con salario
        this.bono = bono;
    }

    // Getter para el bono
    public double getBono() {
        return bono;
    }

    // Setter para el bono con validación
    public void setBono(double bono) {
        if (bono < 0) {
            throw new IllegalArgumentException("El bono no puede ser negativo.");
        }
        this.bono = bono;
    }

    // Método para calcular el salario total
    public double calcularSalarioTotal() {
        return getSalario() + bono;
    }

    // Método para mostrar información del gerente
    public void mostrarInformacion() {
        System.out.println("Salario Base: " + getSalario());
        System.out.println("Bono: " + bono);
        System.out.println("Salario Total: " + calcularSalarioTotal());
    }
}

