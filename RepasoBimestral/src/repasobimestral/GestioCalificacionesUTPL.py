import random

def generar_numero_aleatorio(inicio, fin):
    return random.randint(inicio, fin)

def redondear(numero, decimales):
    return round(numero, decimales)

# Declaración de variables
totalEstudiantes = 0
estudiantesAprobados = 0
estudiantesReprobados = 0

# Imprimir la línea al inicio
print("---------->GESTION--DE--CALIFICACIONES--UTPL<----------")

# Definición de materias disponibles
materias = ["Fundamentos Matematicos", "Fundamentos Computacionales", "Introduccion a la Programacion",
            "Estructuras Discretas", "Computacion y Sociedad", "Humanismo"]

# Seleccionar aleatoriamente una materia
materia = random.choice(materias)

# Bucle para ingresar estudiantes
while True:
    # Definición de nombres disponibles
    nombres = ["Juan", "Maria", "Carlos", "Laura", "Pedro", "Ana", "Diego", "Sofia", "Nicolay", "Andres", "Daniel",
                "Adrian", "Sebastian", "Alisson", "Paula", "Nayeli", "Lady", "Pablo", "Cristian", "James", "Emily", "Dayanna", "Doris"]

    # Seleccionar aleatoriamente un nombre
    nombre = random.choice(nombres)

    # Generar un número de cédula aleatorio con 10 dígitos
    cedula = 1100000000 + random.randint(0, 100000000)

    # Generar notas aleatorias para ACD, APE y AA
    ACD = random.random() * 10
    APE = random.random() * 10
    AA = random.random() * 10

    # Convertir las notas a los porcentajes correspondientes según la ponderación
    notaACD = redondear((ACD * 0.35), 2)
    notaAPE = redondear((APE * 0.35), 2)
    notaAA = redondear((AA * 0.3), 2)

    # Calcular el promedio de las notas
    promedio = redondear((notaACD + notaAPE + notaAA), 2)

    # Mostrar los resultados de las calificaciones del estudiante
    print("----------RESULTADOS-----------")
    print("NOMBRE DEL ESTUDIANTE:", nombre)
    print("CEDULA:", cedula)
    print("MATERIA:", materia)
    print("Nota ACD (3,5/10) :", notaACD)
    print("Nota APE (3,5/10):", notaAPE)
    print("Nota AA (3/10):", notaAA)
    print("Promedio:", promedio)
    print("-----------------------")

    # Verificar si el estudiante aprobó o necesita examen de recuperación
    if promedio >= 7.0:
        print("El estudiante ha aprobado la materia.")
        estudiantesAprobados += 1
    else:
        print("El estudiante debe rendir un examen de recuperacion.")
        estudiantesReprobados += 1

    # Preguntar si desea ingresar otro estudiante
    print("=======================================")
    notas = input("Desea ingresar otro estudiante? (Si/No): ")
    if notas.lower() != 'si':
        break

# Calcular estadísticas finales de aprobación y reprobación
totalEstudiantes = estudiantesAprobados + estudiantesReprobados
print("--------->ESTADISTICA--DE--LA--MATERIA<-----------")
print("Estudiantes aprobados:", estudiantesAprobados)
print("Estudiantes reprobados:", estudiantesReprobados)
# Calcular y mostrar el porcentaje de aprobación y reprobación
print(f"Porcentaje de aprobacion: {(estudiantesAprobados / totalEstudiantes) * 100}%")
print(f"Porcentaje de reprobacion: {(estudiantesReprobados / totalEstudiantes) * 100}%")
