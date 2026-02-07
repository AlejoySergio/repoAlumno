public class AlumnoG {
    // Atributos privados para seguir el principio de encapsulamiento
    private String nombre;
    private String telefono;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public AlumnoG(String nombre, String telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        // Generar notas aleatorias entre 0.0 y 10.0
        this.nota1 = Math.random() * 10;
        this.nota2 = Math.random() * 10;
        this.nota3 = Math.random() * 10;
    }

    // Método para imprimir los datos formateados
    public void imprimirReporte() {
        System.out.println("--- Reporte de Alumno ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
        System.out.printf("Notas: [%.2f, %.2f, %.2f]\n", nota1, nota2, nota3);
        System.out.printf("Promedio Final: %.2f\n", (nota1 + nota2 + nota3) / 3);
        System.out.println("-------------------------");
    }
}
