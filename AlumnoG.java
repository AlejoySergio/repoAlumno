public class AlumnoG {
    String nombre;
    String telefono;
    double n1, n2, n3;
    double media; // Atributo para la media

    public AlumnoG(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        
        // Generación de las 3 notas aleatorias (0.0 a 10.0)
        this.n1 = Math.random() * 10;
        this.n2 = Math.random() * 10;
        this.n3 = Math.random() * 10;
        
        // Cálculo de la media
        this.media = (n1 + n2 + n3) / 3;
    }

    public void visualizar() {
        System.out.println("Alumno: " + nombre + " | Tel: " + telefono);
        System.out.printf("   Notas: [%.1f, %.1f, %.1f]\n", n1, n2, n3);
        System.out.printf("   Media: %.2f\n", media);
        System.out.println("------------------------------------------");
    }
}
