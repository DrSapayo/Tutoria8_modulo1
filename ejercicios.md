### Ejercicios de práctica – Métodos y Arrays en Java

## Estos ejercicios buscan reforzar el uso de:

- Métodos

- Parámetros

- Retorno de valores

- Ciclos for

- Arreglos (arrays)

## Ejercicio 1 – Método con parámetro

Crea un método llamado saludar que reciba un nombre y muestre un saludo.

Ejemplo

Entrada:

saludar("Juan")

Salida esperada:

Hola Juan, bienvenido al sistema

# Esqueleto

    public static void main(String[] args) {

        saludar("Juan");
        saludar("Maria");

    }

    public static void saludar(String nombre){

        // COMPLETAR

    }
## Ejercicio 2 – Método con retorno

Crea un método llamado dobleNumero que reciba un número entero y devuelva el doble.

Ejemplo

Entrada:

dobleNumero(8)

Salida esperada:

16

# Esqueleto
    public static void main(String[] args) {

        int resultado = dobleNumero(8);
        System.out.println("El doble es: " + resultado);

    }

    public static int dobleNumero(int numero){

        // COMPLETAR

    }
## Ejercicio 3 – Método con parámetros

Crea un método llamado mostrarProducto que reciba:

- nombre del producto

- precio

- muestre la información.

Ejemplo

Salida esperada:

Producto: Zapatos
Precio: 80000

# Esqueleto
    public static void main(String[] args) {

        mostrarProducto("Zapatos", 80000);

    }

    public static void mostrarProducto(String nombre, int precio){

        // COMPLETAR

    }
## Ejercicio 4 – Método con parámetros y retorno

Crea un método llamado calcularAreaRectangulo que reciba:

- base

- altura

- devuelva el área del rectángulo.

Fórmula
area = base * altura

# Esqueleto
    public static void main(String[] args) {

        int area = calcularAreaRectangulo(5, 4);
        System.out.println("Area: " + area);

    }

    public static int calcularAreaRectangulo(int base, int altura){

        // COMPLETAR

    }

## Ejercicio 5 – Usando arrays

El programa tiene un arreglo con notas de estudiantes.

Debes mostrar todas las notas usando un for.


# Esqueleto
    public static void main(String[] args) {

        int[] notas = {4, 3, 5, 2, 4};

        mostrarNotas(notas);

    }

    public static void mostrarNotas(int[] datos){

        // COMPLETAR

    }

Salida esperada:

4
3
5
2
4

## Ejercicio 6 – Sumar valores de un arreglo

Crea un método que reciba un arreglo de números y devuelva la suma total.


# Esqueleto
    public static void main(String[] args) {

        int[] numeros = {5, 10, 15, 20};

        int total = sumarArreglo(numeros);

        System.out.println("Suma total: " + total);

    }

    public static int sumarArreglo(int[] datos){

        int suma = 0;

        // COMPLETAR

        return suma;

    }

## Ejercicio 7 – Encontrar el número mayor

Crea un método que reciba un arreglo y devuelva el número mayor.

# Esqueleto
    public static void main(String[] args) {

        int[] numeros = {8, 3, 15, 2, 10};

        int mayor = encontrarMayor(numeros);

        System.out.println("Mayor: " + mayor);

    }

    public static int encontrarMayor(int[] datos){

        int mayor = datos[0];

        // COMPLETAR

        return mayor;

    }
## Reto final

Crear un método que calcule el promedio de un arreglo de números.

Fórmula
promedio = suma / cantidad de elementos
Firma del método
public static double calcularPromedio(int[] datos)