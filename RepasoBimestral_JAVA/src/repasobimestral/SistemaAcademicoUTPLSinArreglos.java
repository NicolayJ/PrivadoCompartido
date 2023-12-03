package repasobimestral;

import java.util.Random; // De java importas la funcionalidad de Random que genera de manera aleatoria datos
import java.util.Scanner; //De java especificamente de la libreria util el Scanner sirve para que el usuario ingrese y lea datos

public class SistemaAcademicoUTPLSinArreglos {
    public static void main(String[] args) {
        // Declaración de variables
        int totalEstudiantes, estudiantesAprobados = 0, estudiantesReprobados = 0;
        double ACD, APE, AA, notaACD, notaAPE, notaAA;
        Random rand = new Random();
        Scanner tecla = new Scanner(System.in);

        System.out.println("---------->GESTION--DE--CALIFICACIONES--UTPL<----------");

        char notas;
        do {
            // Ingreso de materia, nombre y cédula
            System.out.println("Ingrese la materia: ");
            String materia = tecla.nextLine();

            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = tecla.nextLine();

            System.out.println("Ingrese la cedula del estudiante: ");
            int cedula = tecla.nextInt();

            // Generación de notas aleatorias
            ACD = rand.nextDouble() * 10;
            APE = rand.nextDouble() * 10;
            AA = rand.nextDouble() * 10;

            // Convertir notas al porcentaje correspondiente según la ponderación
            notaACD = Math.round((ACD * 0.35) * 100.0) / 100.0;
            notaAPE = Math.round((APE * 0.35) * 100.0) / 100.0;
            notaAA = Math.round((AA * 0.3) * 100.0) / 100.0;

            // Calcular promedio de las notas
            double promedio = Math.round((notaACD + notaAPE + notaAA) * 100.0) / 100.0;

            // Mostrar resultados de calificaciones
            System.out.println("----------RESULTADOS-----------");
            System.out.println("NOMBRE DEL ESTUDIANTE: " + nombre);
            System.out.println("CEDULA: " + cedula);
            System.out.println("MATERIA: " + materia);
            System.out.println("Nota ACD convertida: " + notaACD);
            System.out.println("Nota APE convertida: " + notaAPE);
            System.out.println("Nota AA convertida: " + notaAA);
            System.out.println("PROMEDIO: " + promedio);
            System.out.println("-----------------------");

            // Verificar si el estudiante aprobó o debe rendir un examen de recuperación
            if (promedio >= 7.0) {
                System.out.println("El estudiante ha aprobado la materia.");
                estudiantesAprobados++;
            } else {
                System.out.println("El estudiante debe rendir un examen de recuperacion.");
                estudiantesReprobados++;
            }

            // Preguntar si se desea ingresar otro estudiante
            System.out.println("=======================================");
            System.out.println("Desea ingresar otro estudiante? (Si/No)");
            notas = tecla.next().charAt(0);
            tecla.nextLine(); // Limpiar el buffer del Scanner

        } while (notas == 'S' || notas == 's');

        // Calcular y mostrar estadísticas finales
        totalEstudiantes = estudiantesAprobados + estudiantesReprobados;
        System.out.println("--------->ESTADISTICA--DE--LA--MATERIA<-----------");
        System.out.println("Estudiantes aprobados: " + estudiantesAprobados);
        System.out.println("Estudiantes reprobados: " + estudiantesReprobados);
        System.out.println("Porcentaje de aprobacion: " + ((double) estudiantesAprobados / totalEstudiantes) * 100 + "%");
        System.out.println("Porcentaje de reprobacion: " + ((double) estudiantesReprobados / totalEstudiantes) * 100 + "%");
    }
}