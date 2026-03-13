import java.util.Scanner;

public class forsYArrays {

    static Scanner sc = new Scanner(System.in);

    static int[] puntajes = new int[5];

    public static void main(String[] args) {

        registrarPuntajes();

        mostrarPuntajes(puntajes);

        int total = calcularTotal(puntajes);
        System.out.println("Total de puntos: " + total);

        int mayor = obtenerMayor(puntajes);
        System.out.println("Puntaje más alto: " + mayor);
    }

    //ALMACENAR PUNTAJES

    public static void registrarPuntajes(){

        //CÓDIGO AQUÍ

    }

    //IMPRIMIR PUNTAJES

    public static void mostrarPuntajes(int[] datos){

        //CÓDIGO AQUÍ

    }

    //SUMAR PUNTAJES

    public static int calcularTotal(int[] datos){

        int suma = 0;

        //CÓDIGO AQUÍ

        return suma;
    }

    //COMPARAR E IMPRIMIR EL MAYOR
    
    public static int obtenerMayor(int[] datos){

        int mayor = datos[0];

        //CÓDIGO AQUÍ

        return mayor;
    }

    //CALCULAR EL PROMEDIO DE LOS PUNTAJES

    public static double obtenerPromedio(int[] datos){
        double promedio = 0;

        //CÓDIGO AQUÍ
        
        return promedio;
    }

}