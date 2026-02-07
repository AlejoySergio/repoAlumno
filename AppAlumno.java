public class AppAlumno {
    public static void main(String[] args) {
        System.out.println("=== TEST DE ALUMNOS EN RAMA 'modAlumno' ===");
        System.out.println();

        // Creamos 3 alumnos diferentes
        AlumnoG alumno1 = new AlumnoG("Laura Méndez", "600000001");
        AlumnoG alumno2 = new AlumnoG("Roberto Sanz", "600000002");
        AlumnoG alumno3 = new AlumnoG("Lucía Fernández", "600000003");

        // Visualizamos los 3 objetos creados
        alumno1.visualizar();
        alumno2.visualizar();
        alumno3.visualizar();
    }
}
