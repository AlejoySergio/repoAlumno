public class mainAlumnoG {
    public static void main(String[] args) {
        // Crear una instancia de AlumnoG
        AlumnoG estudiante1 = new AlumnoG("Carlos Ruiz", "655-123-456", 19);
        
        // Mostrar los resultados
        estudiante1.imprimirReporte();
        
        // Ejemplo de un segundo alumno
        AlumnoG estudiante2 = new AlumnoG("Lucía García", "688-987-654", 21);
        estudiante2.imprimirReporte();
    }
}
