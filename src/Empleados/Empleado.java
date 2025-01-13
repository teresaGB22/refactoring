package Empleados;

public class Empleado {
    // Atributo privado para encapsulación
    private double salario;

    // Constructor por defecto
    public Empleado() {
        this.salario = 0.0; // Inicialización explícita
    }

    // Constructor con parámetro de salario
    public Empleado(double salario) {
        setSalario(salario); // Usa el setter para validación
    }

    // Getter para el salario
    public double getSalario() {
        return salario;
    }

    // Setter para el salario con validación
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

    // Método para mostrar información básica del empleado
    public void mostrarInformacion() {
        System.out.println("Salario: " + salario);
    }
}

