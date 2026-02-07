import java.util.Scanner;

public class AppArrayAlumnos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Leer el número de alumnos
        System.out.print("¿Cuántos alumnos tiene la asignatura?: ");
        int numAlumnos = teclado.nextInt();
        teclado.nextLine(); // Limpiar el buffer

        AlumnoG[] listaAlumnos = new AlumnoG[numAlumnos];

        // 2. Introducir datos de los alumnos
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("\nDatos del alumno " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();
            System.out.print("Teléfono: ");
            String tel = teclado.nextLine();
            
            // Creamos el objeto (recuerda que genera las 3 notas y la media solo)
            listaAlumnos[i] = new AlumnoG(nombre, tel);
        }

        // 3. Calcular la media del grupo
        double sumaMedias = 0;
        for (AlumnoG al : listaAlumnos) {
            sumaMedias += al.getMedia();
        }
        double mediaGrupo = sumaMedias / numAlumnos;
        System.out.printf("\nMedia global del grupo: %.2f\n", mediaGrupo);

        // 4. Visualizar alumnos por encima de la media y buscar al mejor
        System.out.println("\nAlumnos con nota superior a la media:");
        AlumnoG mejorAlumno = listaAlumnos[0];

        for (AlumnoG al : listaAlumnos) {
            // ¿Está por encima de la media?
            if (al.getMedia() > mediaGrupo) {
                System.out.println("- " + al.nombre + " (Media: " + String.format("%.2f", al.getMedia()) + ")");
            }
            // ¿Es el alumno con la mayor nota?
            if (al.getMedia() > mejorAlumno.getMedia()) {
                mejorAlumno = al;
            }
        }

        // 5. Mostrar el alumno con mayor nota
        System.out.println("\nEl alumno con la mayor nota es: " + mejorAlumno.nombre + 
                           " con un " + String.format("%.2f", mejorAlumno.getMedia()));
        
        teclado.close();
    }
}
