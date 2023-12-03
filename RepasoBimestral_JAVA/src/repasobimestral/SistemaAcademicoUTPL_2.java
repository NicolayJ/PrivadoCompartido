package repasobimestral;
import java.util.Random; // De java importas la funcionalidad de Random que genera de manera aleatoria datos
import java.util.Scanner; //De java especificamente de la libreria util el Scanner sirve para que el usuario ingrese y lea datos

public class SistemaAcademicoUTPL_2 {
    
    public static void main(String[] args) {
        //Declaracion de variables
        int totalEstudiantes, estudiantesAprobados = 0, estudiantesReprobados = 0, cedula, notas;
        double ACD, APE, AA, notaACD, notaAPE, notaAA;
        // Importación de las clases Random y Scanner para generar números aleatorios y leer la entrada del usuario, respectivamente
        Random rand = new Random(); // Creación de un objeto Random para generar números aleatorio
        Scanner tecla = new Scanner(System.in); // Creación de un objeto Scanner para recibir entrada del usuario

        System.out.println("---------->GESTION--DE--CALIFICACIONES--UTPL<----------"); //Carpinteria para que quede bonito :D
        // Definición de las materias disponibles para seleccionar aleatoriamente
        String[] materias = {"Fundamentos Matematicos", "Fundamentos Computacionales", "Introduccion a la Programacion",
                "Estructuras Discretas", "Computacion y Sociedad", "Humanismo"}; //Aqui es como una caja donde guardo los nombres y luego el sistema agarra una sola materia, al azar
        // Seleccionar aleatoriamente una materia de la lista
        String materia = materias[rand.nextInt(materias.length)];
        // Puse la materia afuera del ciclo porque para mi no tiene sentido preguntar varias veces la materia
        
        // Inicio del bucle para ingresar estudiantes
            // Use el do-while porque como sabes siempre se repite una vez y luego pregunta la condicion, entonces aja es mejor que ya este ingresado un estudiante y luego se pregunta si quieren mas
            // y si no quieren mas solo se muestra los resultados individuales del estudiante
        do {
            // Definición de nombres disponibles para seleccionar aleatoriamente
            String[] nombres = {"Juan", "Maria", "Carlos", "Laura", "Pedro", "Ana", "Diego", "Sofia", "Nicolay", "Andres", "Daniel",
                "Adrian", "Sebastian", "Alisson", "Paula", "Nayeli", "Lady", "Pablo", "Cristian", "James", "Emily", "Dayanna", "Doris"}; //Aplique la misma que las materias (Si tienes mas nombres pasas) 
            // Seleccionar aleatoriamente un nombre de la lista
            String nombre = nombres[rand.nextInt(nombres.length)];

            // Generar un número de cédula aleatorio con 10 dígitos, comenzando con 11 (la cedula ecuatoriana tiene 10 digitos y siempre empiezan con 11)
            cedula = 1100000000 + rand.nextInt(100000000);

            // Generar notas aleatorias para ACD, APE y AA
                //Aqui las genera el java.util.Random ademas el double es para notas decimales y si te das cuenta hay ran.nextDouble()
                //que es como si fuera teclado.nextInt() osea la computadora lee el dato
            ACD = rand.nextDouble() * 10;
            APE = rand.nextDouble() * 10;
            AA = rand.nextDouble() * 10;

            // Convertir las notas a los porcentajes correspondientes según la ponderación
                //Bueno ya sabes ACD vale 3.5/ 10, APE vale 3.5/10 y AA vale 3/10
            notaACD = Math.round((ACD * 0.35) * 100.0) / 100.0;
            notaAPE = Math.round((APE * 0.35) * 100.0) / 100.0;
            notaAA = Math.round((AA * 0.3) * 100.0) / 100.0;

            // Calcular el promedio de las notas
                //Cierto el Math.round(( "operacion" )*100.0)/100.0  sirve para redondear a 2 decimales arriba tambien uso
            double promedio = Math.round((notaACD + notaAPE + notaAA) * 100.0) / 100.0;

            // Mostrar los resultados de las calificaciones del estudiante
            System.out.println("----------RESULTADOS-----------"); //Carpinteria bonita =3
            System.out.println("NOMBRE DEL ESTUDIANTE: " + nombre);
            System.out.println("CEDULA: " + cedula);
            System.out.println("MATERIA: " + materia);
            System.out.println("Nota ACD (3.5/10): " + notaACD);
            System.out.println("Nota APE (3.5/10): " + notaAPE);
            System.out.println("Nota AA (3/10): " + notaAA);
            System.out.println("Promedio: " + promedio);
            System.out.println("-----------------------"); //+ Carpinteria 

            // Verificar si el estudiante aprobó o debe rendir un examen de recuperación
                //No creo que sea necesario explicarte esto
            if (promedio >= 7.0) {
                System.out.println("El estudiante ha aprobado la materia.");
                estudiantesAprobados++; //Esto si te explico, el sistema esta internamente guardando cuantos estudiantes pasan
            } else {
                System.out.println("El estudiante debe rendir un examen de recuperacion.");
                estudiantesReprobados++; // Y aqui tambien igual que arriba guarda es como un contador mas o menos
            }

            // Preguntar si desea ingresar otro estudiante
            System.out.println("======================================="); // Carpinteria y por cierto cuando uso == es porque quiero que la separacion se note bien de por ejemplo el final del ciclo
            System.out.println("Desea ingresar otro estudiante? (Si/No)");//Hago la pregunta que prepara la condicion del do-while
            notas = tecla.next().charAt(0); 
            //Si el usuario responde algo iniciando S o s entonces el ciclo se repite si responde iniciando con N o no entonces se rompe
            //Es curioso porque puedes poner Sapo o sno o sinverguenza y el sistema lo lee como si 
        } while (notas == 'S' || notas == 's'); // Repetir el bucle si la respuesta es 'S' o 's'
        // el || significa "or" en java ya sabes que en java debes hablar en ingles los terminos, en pseudocodigo eso se llama "o" (por si no sabes ingles)
        // el && significa "and" en java igual no uso pero aja para que diferencies ya aprendas, en pseudocodigo eso se llama "y" (por si no sabes ingles)
        
        // ya sabes la regla de que si hay "o" la condicion debe cumplir cualguiera de las 2 partes en ese caso si el usuario escribe con S o con s igual se ejecuta
        // si la regla tiene "y" entonces la condicion dice que debe cumplir con las 2 partes si o si de manera obligatoria
        
        // Calcular y mostrar estadísticas finales de aprobación y reprobación
        totalEstudiantes = estudiantesAprobados + estudiantesReprobados; 
        System.out.println("--------->ESTADISTICA--DE--LA--MATERIA<-----------");//Carpinteria :D
        System.out.println("Estudiantes aprobados: " + estudiantesAprobados); //El contador de la linea 69 usas aqui
        System.out.println("Estudiantes reprobados: " + estudiantesReprobados); //El contador de la linea 72 usas aqui
        // Calcular y mostrar el porcentaje de aprobación y reprobación
        System.out.println("Porcentaje de aprobacion: " + ((double) estudiantesAprobados / totalEstudiantes) * 100 + "%"); //solo es porcentaje
        System.out.println("Porcentaje de reprobacion: " + ((double) estudiantesReprobados / totalEstudiantes) * 100 + "%");//solo es porcentaje
    }
}


