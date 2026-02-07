public class AlumnoG {
    String nombre;
    String telefono;
    double n1, n2, n3;

    public AlumnoG(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.n1 = Math.random() * 10;
        this.n2 = Math.random() * 10;
        this.n3 = Math.random() * 10;
    }

    public void visualizar() {
        double promedio = (n1 + n2 + n3) / 3;
        System.out.println("Alumno: " + nombre + " | Tel: " + telefono + 
            " | Notas: " + String.format("%.1f, %.1f, %.1f", n1, n2, n3));
    }
}
