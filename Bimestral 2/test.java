package com.diego.main;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int dia, horario, entradasNormal, entradasPrefer; 
        double tarifaNormal, tarifaPrefe;
        String nombre;
        Boolean normalResp, preferResp;
        //Se pregunta al usuario 
        System.out.print("Ingrese el nombre: ");
        nombre = tecla.nextLine();
        //Se agrega nota sobre la hora de las funciones 
        System.out.println("o---> NOTA <---o \n Las funciones tanto internacionales como nacionales empienzan en horario nocturno los precios de los boletos aumentan a partir de las 18:00 horas hasta las 02:00 horas del dia siguiente");
        //Se imprime el cronograma para que el usuario vea
        System.out.println("--------------------CRONOGRAMA-FERIA-DE-LOJA-2024--------------------\nDEL 31 DE AGOSTO HASTA EL 17 DE SEPTIEMBRE DEL 2024");
        System.out.println("====================================================================");
        System.out.println("1. SABADO 31 DE AGOSTO \n --->GRAN APERTURA CON FUNCIONES INTERNACIONALES Y NACIONALES \n      Con la participación de : ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("2. DOMINGO 1 DE SEPTIEMBRE \n ---> FUNCION NACIONAL \n      Con la participacion de: ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("3. LUNES 2 DE SEPTIEMBRE \n ---> SIN PARTICIPACION DE FUNCIONES");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("4. MARTES 3 DE SEPTIEMBRE \n ---> SIN PARTICIPACION DE FUNCIONES");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("5. MIERCOLES 4 DE SEPTIEMBRE \n ---> SIN PARTICIPACION DE FUNCIONES");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("6. JUEVES 5 DE SEPTIEMBRE \n ---> SIN PARTICIPACION DE FUNCIONES");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("7. VIERNES 6 DE SEPTIEMBRE \n ---> FUNCION NACIONAL \n      Con la participacion de: ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("8. SABADO 7 DE SEPTIEMBRE \n ---> FUNCION NACIONAL \n      Con la participacion de: ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("9. DOMINGO 8 DE SEPTIEMBRE \n ---> SIN PARTICIPACION DE FUNCIONES");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("10. LUNES 9 DE SEPTIEMBRE \n ---> SIN PARTICIPACION DE FUNCIONES");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("11. MARTES 10 DE SEPTIEMBRE \n ---> SIN PARTICIPACION DE FUNCIONES");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("12. MIERCOLES 11 DE SEPTIEMBRE \n ---> SIN PARTICIPACION DE FUNCIONES");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("13. JUEVES 12 DE SEPTIEMBRE \n ---> SIN PARTICIPACION DE FUNCIONES");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("14. VIERNES 13 DE SEPTIEMBRE \n ---> FUNCION NACIONAL \n      Con la participacion de: ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("15. SABADO 14 DE SEPTIEMBRE \n ---> FUNCION INTERNACIONAL \n      Con la participacion de: ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("16. DOMINGO 15 DE SEPTIEMBRE \n ---> FUNCION NACIONAL \n      Con la participacion de: ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("17. LUNES 16 DE SEPTIEMBRE \n ---> FUNCION INTERNACIONAL \n      Con la participacion de: ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("18. MARTES 17 DE SEPTIEMBRE \n --->GRAN CIERRE CON FUNCIONES INTERNACIONALES Y NACIONALES \n      Con la participación de : ");
        System.out.println("====================================================================");
        System.out.println("o------------------------COSTO--DE--TARIFAS----------------------------o");
        System.out.println("     TARIFA NORMAL: $1,50 (Para adultos)");
        System.out.println("     TARIFA PREFERENCIAL: $0,75 (Para personas con discapacidad y tercera edad)");
        System.out.println("o----->> NOTA DE COSTOS<<-----o");
        System.out.println("___________________________________________________________________________________________________________");
        System.out.println("| Para el dia de funciones el precio de entrada aumenta a continuacion se describen los precios especiales: |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("FUNCION NACIONAL <<-----");
        System.out.println("     TARIFA NORMAL: $5,00 (Para adultos)");
        System.out.println("     TARIFA PREFERENCIAL: $2,50 (Para personas con discapacidad y tercera edad)");
        System.out.println("FUNCION INTERNACIONAL <<-----");
        System.out.println("     TARIFA NORMAL: $7,00 (Para adultos)");
        System.out.println("     TARIFA PREFERENCIAL: $3,50 (Para personas con discapacidad y tercera edad)");
        System.out.println("DIA DE APERTURA Y CIERRE <<-----");
        System.out.println("     TARIFA NORMAL: $10,0 (Para adultos)");
        System.out.println("     TARIFA PREFERENCIAL: $5,00 (Para personas con discapacidad y tercera edad)");
        // Se pide el dia de asistencia
        System.out.println("Ingrese el dia al cual desea asistir(debe ingresar el numeral asignado en el cronograma): ");
        dia = tecla.nextInt();
        // Se escoge el horario de dia o de noche
        System.out.println("Ingrese el horario el cual desea ingresar (ingrese el numeral del horario a escoger): \n 1. Horario Normal (Empieza a partir de las 02:01 am hasta las 17:59 pm) \n 2. Horario Nocturno  (Empiez a partir de las 18:00 pm hasta las 02:00 am)");
        horario = tecla.nextInt();
        // Preguntar al usuario si desea comprar entradas normales y preferenciales
        System.out.print("Desea comprar entradas de tarifa Normal (si/no)? "); 
        normalResp = tecla.nextBoolean();
        if (normalResp) { System.out.print("Ingrese la cantidad de entradas de tarifa Normal que desea comprar: "); 
        entradasNormal = tecla.nextInt(); }
        System.out.print("Desea comprar entradas de tarifa Preferencial (si/no)? "); 
        preferResp = tecla.nextBoolean();
        if (preferResp) { System.out.print("Ingrese la cantidad de entradas de tarifa Preferencial que desea comprar: "); 
        entradasPrefer = tecla.nextInt(); }
    }
    // Calcular la tarifa normal en base al dia escogido
    public double costTariNor(int dia,int horario, boolean normalResp){
        double tarifaNormal;
        if (dia == 1 || dia == 18) { // Dia de Apertura y Cierre
            if (horario == 2) {
                tarifaNormal=10.00;
            }else{
                tarifaNormal=1.50;
            }
        }else{
            if(dia==2 || dia==7 || dia==8 || dia==14 || dia==16){ //Funcion Nacional
                if (horario == 2) {
                    tarifaNormal=5.00;
                }else{
                    tarifaNormal=1.50;
                }
            }else{
                if (dia==15 || dia ==17) { // Funcion Internacional
                    if (horario == 2) {
                        tarifaNormal=7.00;
                    }else{
                        tarifaNormal=1.50;
                    }
                }else{
                    tarifaNormal=1.50; // Dia Normal
                }
            }
        }
        return tarifaNormal;
    }
    public double costTariPrefe(int dia,int horario, boolean preferResp){
        double tarifaPrefe;
        if (dia == 1 || dia == 18) { // Dia Apertura y de Cierre
            if (horario == 2) {
                tarifaPrefe=5.00;
            }else{
                tarifaPrefe=0.75;
            }
        }else{
            if(dia==2 || dia==7 || dia==8 || dia==14 || dia==16){ //Funcion Nacional
                if (horario == 2) {
                    tarifaPrefe=2.50;
                }else{
                    tarifaPrefe=0.75;
                }
            }else{
                if (dia==15 || dia ==17) { //Funcion Internacional
                    if (horario == 2) {
                        tarifaPrefe=3.50;
                    }else{
                        tarifaPrefe=0.75;
                    }
                }else{
                    tarifaPrefe=0.75; // Dia Normal
                }
            }
        }
        return tarifaPrefe;
    }

}
