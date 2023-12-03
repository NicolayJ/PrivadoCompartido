package repasobimestral;
import java.util.Scanner;

public class AdivinaNumero2 {
    
    public static void main(String[] args) {
        int numAdivinar, numIngresado, intentosUsados = 0, intentos = 10;
        Scanner tecla = new Scanner(System.in);
        numAdivinar = (int) (Math.random() * 100 + 1);
        System.out.println("BIENVENIDO A ADIVINAR EL NUMERO 2.0 \nINSTRUCCIONES: ");
        System.out.println(" 1. El rango del numero que debes adivinar esta entre el 1 y el 100 \n 2. Tienes tan solo 10 intentos para adivinar \n 3. Tendras la oportunidad de pedir pistas pero esto te restara un intento \n 4. El numero a adivinar es un entero \n 5. Si decides pedir una pista aleatoriamente se te dira una caracteristica del numero entre las pistas estaran \n    5.1 Si es mayor \n    5.2 Si es menor es par \n    5.2 impar \n    5.3 es primo \n    5.5 pertenece a la serie fibonacci \n    5.5 es multiplo de 5 \n    5.6 es multiplo de 3");
        System.out.println("Empecemos con el juego, te deseo suerte =D");
        System.out.println("------------------------------------------");

        while (intentos > 0) {
            System.out.println("Te quedan " + intentos + " intentos."); // Muestra la cantidad de intentos restantes
            System.out.print("------> Adivina el numero: ");
            numIngresado = tecla.nextInt(); // Lee el número ingresado por el usuario
            intentosUsados++;

            // Verifica si el número ingresado es igual al número a adivinar
            if (numIngresado == numAdivinar) {
                System.out.println("FELICIDADES, has adivinado el numero en " + intentosUsados + " intentos");
                break; // Termina el juego si el número es adivinado correctamente
            } else {
                System.out.print("Numero equivocado, deseas una pista? (Si/No): ");
                String quierePista = tecla.next();

                // Si el jugador quiere una pista
                if (quierePista.equalsIgnoreCase("Si")) {
                    System.out.println("Se te resta un intento por pedir pista");
                    intentos--; // Descuenta un intento por pedir una pista

                    boolean pistaMostrada = false; // Bandera para verificar si se mostró una pista

                    // Genera un número aleatorio para seleccionar una pista al azar
                    int pistaAleatoria = (int) (Math.random() * 8) + 1;

                    // Verifica las características del número a adivinar y muestra una pista aleatoria
                    if (numAdivinar > numIngresado && pistaAleatoria == 1) {
                        System.out.println("PISTA: Intenta con un numero mayor.   <---");
                        pistaMostrada = true;
                    }
                    if (numAdivinar < numIngresado && pistaAleatoria == 2) {
                        System.out.println("PISTA: Intenta con un numero menor.   <---");
                        pistaMostrada = true;
                    }
                    if (numAdivinar % 2 == 0 && pistaAleatoria == 3) {
                        System.out.println("PISTA: El numero es par.   <---");
                        pistaMostrada = true;
                    }
                    if (numAdivinar % 2 != 0 && pistaAleatoria == 4) {
                        System.out.println("PISTA: El numero es par.   <---");
                        pistaMostrada = true;
                    }
                    if ((numAdivinar == 1 || numAdivinar == 2 || numAdivinar == 3 || numAdivinar == 5 || numAdivinar == 8 || numAdivinar == 13 || numAdivinar == 21 || numAdivinar == 34 || numAdivinar == 55 || numAdivinar == 89) && pistaAleatoria == 5) {
                        System.out.println("PISTA: El numero pertenece a la secuencia fibonacci   <---");
                        pistaMostrada = true;
                    }
                    if (numAdivinar % 5 == 0 && pistaAleatoria == 6) {
                        System.out.println("PISTA: El numero es multiplo de 5  <---");
                        pistaMostrada = true;
                    }
                    if (numAdivinar % 3 == 0 && pistaAleatoria == 7) {
                        System.out.println("PISTA: El numero es multiplo de 3  <---");
                        pistaMostrada = true;
                    }
                    else {
                        System.out.println("*Elige cuidadosamente el proximo numero*");
                        intentos--; // Descuenta un intento por rechazar la pista
                    }
                } else if (quierePista.equalsIgnoreCase("No")) {
                    System.out.println("*Elige cuidadosamente el proximo numero*");
                    // No se descuenta ningún intento si el jugador no quiere una pista
                }
            }
        }
        // Si se agotan los intentos sin adivinar el número
        if (intentos == 0) {
            System.out.println("Lo siento, has agotado tus intentos.");
            System.out.println("El numero era: " + numAdivinar);
        }
    }
}

