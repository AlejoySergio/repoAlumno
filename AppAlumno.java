public class AppAlumno {
    public static void main(String[] args) {
        // Creamos varios alumnos para que veas las 3 notas de cada uno
        AlumnoG a1 = new AlumnoG("Carlos", "600111222", 20);
        AlumnoG a2 = new AlumnoG("Elena", "611222333", 21);
        AlumnoG a3 = new AlumnoG("Lucas", "622333444", 19);

        System.out.println("--- Listado de Alumnos ---");
        a1.visualizar();
        a2.visualizar();
        a3.visualizar();
    }
}
