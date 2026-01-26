package repoAlumno;

import java.util.Random;

public class AlumnoG {
    // Atributos
    private String nombre;
    private String telefono;
    private int edad;
    private double[] notas = new double[3];

    // Constructor
    public AlumnoG(String nombre, String telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        generarNotasAleatorias();
    }

    // Método para generar notas entre 0.0 y 10.0
    private void generarNotasAleatorias() {
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            // Genera un decimal y lo redondea a un decimal
            this.notas[i] = Math.round((rand.nextDouble() * 10) * 10.0) / 10.0;
        }
    }

    // Método para mostrar los datos
    public void mostrarInfo() {
        System.out.println("--- Ficha del Alumno ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print("[" + nota + "] ");
        }
        System.out.println("\n------------------------");
    }
}
